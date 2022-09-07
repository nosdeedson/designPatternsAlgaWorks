package com.ejs.designPatterns.controller;

import com.ejs.designPatterns.business.decorator.CompraCartaoBusiness;
import com.ejs.designPatterns.model.compraCartao.exemplo.CompraCartaoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cartao-creditos")
public class ComprarCartaoController {

    @Autowired
    private CompraCartaoBusiness business;

    @PostMapping
    public void comprar(@RequestBody CompraCartaoDTO dto) {
        this.business.comprarCartato(dto);
    }
}
