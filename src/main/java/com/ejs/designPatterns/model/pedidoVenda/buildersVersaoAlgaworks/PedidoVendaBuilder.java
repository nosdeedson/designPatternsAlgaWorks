package com.ejs.designPatterns.model.pedidoVenda.buildersVersaoAlgaworks;

import java.math.BigDecimal;

import com.ejs.designPatterns.model.pedidoVenda.Cliente;
import com.ejs.designPatterns.model.pedidoVenda.ItemPedido;
import com.ejs.designPatterns.model.pedidoVenda.PedidoVenda;

public class PedidoVendaBuilder {

	private PedidoVenda instancia;
	
	public PedidoVendaBuilder() {
		this.instancia = new PedidoVenda();
	}
	
	public PedidoVendaBuilder comClienteVip(String nome ) {
		this.instancia.setCliente(this.definirCliente(nome, true));
		return this;
	}
	
	public PedidoVendaBuilder comClienteNormal(String nome ) {
		this.instancia.setCliente(this.definirCliente(nome, false));
		return this;
	}
	
	public PedidoVendaBuilder comItemPedido(String nome, Integer quantidade, BigDecimal valorUnitario) {
		ItemPedido item = new ItemPedido();
		item.setNome(nome);
		item.setQuantidade(quantidade);
		item.setValorUnitario(valorUnitario);
		this.instancia.setItensPedido(item);
		return this;
	}
	
	public PedidoVendaBuilder comNumero(String numero) {
		this.instancia.setNumero(numero);
		return this;
	}
	
	private Cliente definirCliente(String nome, boolean isVip) {
		Cliente cliente = new Cliente(nome);
		cliente.setVip(isVip);
		return cliente;
	}
	
	public PedidoVenda construir() {
		return this.instancia;
	}
}
