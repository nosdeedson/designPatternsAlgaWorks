package com.ejs.designPatterns.model.contatos.proxy;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ContatosXMLProxy implements  IContato{

    private  ContatoXML contatoXML;
    private List<String> nomesArquivos;

    public ContatosXMLProxy(String... nomesArquivos){
        this.nomesArquivos = new ArrayList<>(Arrays.asList(nomesArquivos));

    }

    @Override
    public String buscarPorEmail(String email) throws IOException, URISyntaxException {
        String nome = null;
        Random random = new Random();
        int quantidadeArquivos = this.nomesArquivos.size();
        for (int i = 0; i < quantidadeArquivos; i++) {
            int indiceParaPesquisar = random.nextInt(nomesArquivos.size());

            String nomeArquivo = nomesArquivos.remove(indiceParaPesquisar);
            this.contatoXML = new ContatoXML(nomeArquivo);
            nome = this.contatoXML.buscarPorEmail(email);
            if( nome != null) break;
        }
        return nome;
    }
}
