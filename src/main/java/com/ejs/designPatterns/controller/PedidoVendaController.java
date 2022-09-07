package com.ejs.designPatterns.controller;

import com.ejs.designPatterns.business.observer.PedidoBusiness;
import com.ejs.designPatterns.model.financeiro.observerDesafio.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejs.designPatterns.business.builder.PedidoVendaBusinnes;
import com.ejs.designPatterns.model.pedidoVenda.PedidoVenda;
import com.ejs.designPatterns.model.pedidoVenda.PedidoVendaMinhaVersao;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
@RequestMapping("pedido-vendas")
public class PedidoVendaController {
	
	@Autowired
	private PedidoVendaBusinnes businnes;
	
	@Autowired
	private PedidoBusiness pedidoBusiness;

	@GetMapping
	public PedidoVenda pedidoVenda() {
		return this.businnes.pedidoVenda();
	}
	
	@GetMapping("minha-versao")
	public PedidoVendaMinhaVersao pedidoVendaMinhaVersao() {
		PedidoVendaMinhaVersao p = this.businnes.pedidoVendaMinhaVersao();
		return p;
	}
	
	@GetMapping("observer")
	public List<Pedido> getPedidos() throws FileNotFoundException {
		return this.pedidoBusiness.getPedidos();
	}
}
