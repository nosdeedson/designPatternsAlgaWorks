package com.ejs.designPatterns.model.contatos.proxy;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.NoTypePermission;
import com.thoughtworks.xstream.security.NullPermission;
import com.thoughtworks.xstream.security.PrimitiveTypePermission;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ContatoXML implements IContato {

    private Map<String, String> contatosEmCache= new HashMap<>();

    public ContatoXML(String... nomesArquivos) throws IOException, URISyntaxException {
        XStream xStream = new XStream();
        xStream.addPermission(NoTypePermission.NONE);
        xStream.addPermission(NullPermission.NULL);
        xStream.addPermission(PrimitiveTypePermission.PRIMITIVES);
        xStream.allowTypes(new Class[] {Contato.class, List.class});
        xStream.alias("contatos", List.class);
        xStream.alias("contato", Contato.class);

        for (String nomeArquivo: nomesArquivos){
            System.out.println("Carregando arquivo: " + nomeArquivo);
           File file = new File(this.getClass().getClassLoader().getResource(nomeArquivo).getFile());
           InputStream input = new FileInputStream(file);
           List<Contato> contatosCarregados = (List<Contato>) xStream.fromXML(input);
           for( Contato c: contatosCarregados){
               this.contatosEmCache.put(c.getEmail(), c.getNome());
           }
        }
    }

    @Override
    public String buscarPorEmail(String email) {
        return contatosEmCache.get(email);
    }
}
