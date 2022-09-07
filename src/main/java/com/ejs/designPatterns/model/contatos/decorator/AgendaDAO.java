package com.ejs.designPatterns.model.contatos.decorator;

import com.thoughtworks.xstream.XStream;
import org.springframework.context.annotation.Bean;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class AgendaDAO implements Agenda{

    @Override
    public void inserir(Contato contato) throws IOException {
        List<Contato> contatos = this.lerArquivo();
        Integer codigo = contatos.get(contatos.size()-1).getCodigo();
        contato.setCodigo(codigo+1);
        contatos.add(contato);
//        String xml = this.contatoToXML(contato);
        this.contatosToXML(contatos);
    }

    @Override
    public Contato buscar(Integer codigo) {
        List<Contato> contatos = this.lerArquivo();
        for (Contato c: contatos ) {
            if(c.getCodigo().equals(codigo)){
                return c;
            }
        }
        throw new RuntimeException("Nenhum contato encontrado como o código: " + codigo);
    }

    private List<Contato> lerArquivo() {
        List<Contato> contatos = new ArrayList<>();
        try {
            XStream xStream = new XStream();
            xStream.allowTypes(new Class[] {Contato.class, List.class});
            xStream.alias("contatos", List.class);
            xStream.alias("contato", Contato.class);
            File file = new File(this.getClass().getClassLoader().getResource("contatos.xml").getFile());
            InputStream inputStream = null;
            inputStream = new FileInputStream(file);
            contatos = (List<Contato>) xStream.fromXML(inputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return contatos;
    }

    private String contatoToXML(Contato contato){
        XStream xStream = new XStream();
        xStream.processAnnotations(Contato.class);
        String xml = xStream.toXML(contato);
        return xml;
    }

    private String contatosToXML(List<Contato> contatos) throws IOException {
        XStream xStream = new XStream();
        xStream.processAnnotations(Contato.class);
        xStream.alias("contatos", List.class);
        String xml = xStream.toXML(contatos);
        Path path = Path.of(this.getClass().getClassLoader().getResource("contatos.xml").getPath());
        Files.deleteIfExists(path);
        FileWriter writer = new FileWriter("contatos.xml");
        writer.write(xml);
        InputStream in = new ByteArrayInputStream(xml.getBytes());
        FileCopyUtils.copy(in, Files.newOutputStream(path));
        System.out.println(xml);
        return xml;
    }
}
