package com.ejs.designPatterns.model.enviadorEmail;

import org.springframework.stereotype.Component;

@Component
public class EnviadorEmailGmail implements  EnviadorEmail{
    @Override
    public void enviar(String email) {
        System.out.println("Enviando email para " + email);
    }
}
