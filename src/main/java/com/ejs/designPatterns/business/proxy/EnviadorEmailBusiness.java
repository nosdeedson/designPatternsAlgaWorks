package com.ejs.designPatterns.business.proxy;

import com.ejs.designPatterns.model.enviadorEmail.EnviadorEmailGmailProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.List;

@Service
public class EnviadorEmailBusiness {
    @Autowired
    private EnviadorEmailGmailProxy enviadorEmailGmailProxy;

    public void enviarEmails(List<String> emails) throws FileNotFoundException {
        this.enviadorEmailGmailProxy.conferirEmails(emails);
    }
}
