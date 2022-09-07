package com.ejs.designPatterns.model.contatos.proxy;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URISyntaxException;

@Component
public interface IContato {

    public String buscarPorEmail(String email) throws IOException, URISyntaxException;
}
