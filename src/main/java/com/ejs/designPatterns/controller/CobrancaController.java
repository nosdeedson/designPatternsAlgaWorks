package com.ejs.designPatterns.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejs.designPatterns.business.factoryMethod.CobrancaBusiness;
import com.ejs.designPatterns.model.cobranca.CobrancaDTO;

@RestController
@RequestMapping("cobrancas")
public class CobrancaController {
	
	@Autowired
	private CobrancaBusiness cobrancaBusiness;
	
	@GetMapping
	public String index() {
		return "index";
	}
	
	@PostMapping
	public String emitir(@RequestBody CobrancaDTO cobranca) {
		String emissao = this.cobrancaBusiness.emitir(cobranca);
		return emissao;
	}

}
