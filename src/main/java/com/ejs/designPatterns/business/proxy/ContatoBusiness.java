package com.ejs.designPatterns.business.proxy;

import com.ejs.designPatterns.model.contatos.proxy.ContatoXML;
import com.ejs.designPatterns.model.contatos.proxy.ContatosXMLProxy;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;

@Service
public class ContatoBusiness {

    public String getNome(String email) throws IOException, URISyntaxException {
        /*Sem proxy*/
        ContatoXML contatoXML = new ContatoXML("contatos1.xml", "contatos2.xml");
        return contatoXML.buscarPorEmail(email);
    }

    public String getNomeUsandoProxy(String email) throws IOException, URISyntaxException {
        ContatosXMLProxy contatosXMLProxy = new ContatosXMLProxy("contatos1.xml", "contatos2.xml");
        return contatosXMLProxy.buscarPorEmail(email);
    }
}
