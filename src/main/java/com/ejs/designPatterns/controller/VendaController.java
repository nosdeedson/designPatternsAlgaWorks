package com.ejs.designPatterns.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejs.designPatterns.business.abstractFactory.VendaBusiness;
import com.ejs.designPatterns.model.venda.VendaDTO;
import com.ejs.designPatterns.model.venda.VendaRealizada;

@RestController
@RequestMapping("vendas")
public class VendaController {
	
	@Autowired
	private VendaBusiness vendaBusiness;

	@PostMapping
	public VendaRealizada criarVenda(@RequestBody VendaDTO dto) {
		return this.vendaBusiness.criarVenda(dto);
	}
}
