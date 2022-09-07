package com.ejs.designPatterns.controller;

import com.ejs.designPatterns.business.strategy.CalculaPremioSeguroBusiness;
import com.ejs.designPatterns.model.seguroVeiculo.PropostaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calcula-premio-seguros")
public class CalculaPremioSeguroController {

    @Autowired
    private CalculaPremioSeguroBusiness business;

    @GetMapping
    public String calcularPropostaSeguro(PropostaDTO proposta){
        String propostaSeguro = this.business.calcularPropostaSeguro(proposta);
        return propostaSeguro;
    }
}
