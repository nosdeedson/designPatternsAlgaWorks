package com.ejs.designPatterns.controller;

import com.ejs.designPatterns.business.strategy.CalculaFreteBusiness;
import com.ejs.designPatterns.model.frete.exemplo.TipoFrete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fretes")
public class FreteContoller {

    @Autowired
    private CalculaFreteBusiness business;

    @GetMapping
    public double getValorFrete(@RequestParam("distancia") Integer distancia, @RequestParam("tipo")TipoFrete tipo){
        double valor = this.business.calcularFrete(distancia, tipo);
        return valor;
    }
}
