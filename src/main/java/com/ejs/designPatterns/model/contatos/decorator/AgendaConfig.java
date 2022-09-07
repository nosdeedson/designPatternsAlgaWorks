package com.ejs.designPatterns.model.contatos.decorator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AgendaConfig {

    @Bean()
    public AgendaDAO createAgendaDAO(){
        return new AgendaDAO();
    }
}
