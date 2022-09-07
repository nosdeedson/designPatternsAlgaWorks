package com.ejs.designPatterns.controller;

import com.ejs.designPatterns.business.observer.LancamentosBusiness;
import com.ejs.designPatterns.model.financeiro.observerExemplo.Lancamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("lancamentos")
public class LancamentoController {

    @Autowired
    private LancamentosBusiness lancamentosBusiness;

    @GetMapping
    public List<Lancamento> lancamentosVencidos() {
        List<Lancamento> lancamentos = this.lancamentosBusiness.lancamentosVencidos();
        return lancamentos;
    }
}
