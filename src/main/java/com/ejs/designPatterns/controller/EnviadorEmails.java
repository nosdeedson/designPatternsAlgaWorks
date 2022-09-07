package com.ejs.designPatterns.controller;

import com.ejs.designPatterns.business.proxy.EnviadorEmailBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
@RequestMapping("emails")
public class EnviadorEmails {

    @Autowired
    private EnviadorEmailBusiness enviadorEmailBusiness;

    @GetMapping
    public void enviarEmails(@RequestParam("emails") List<String> emails) throws FileNotFoundException {
        this.enviadorEmailBusiness.enviarEmails(emails);
    }
}
