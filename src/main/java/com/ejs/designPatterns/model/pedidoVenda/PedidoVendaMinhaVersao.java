package com.ejs.designPatterns.model.pedidoVenda;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PedidoVendaMinhaVersao implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String numero;
	
	private Cliente cliente;
	
	private List<ItemPedido> itensPedido;
	
	public PedidoVendaMinhaVersao construir() {
		PedidoVendaMinhaVersao pedido = new PedidoVendaMinhaVersao();
		pedido.cliente = this.cliente;
		pedido.itensPedido = this.itensPedido;
		pedido.numero = this.numero;
		return pedido;
	}
	
	public PedidoVendaMinhaVersao comNumero(String numero) {
		this.numero = numero;
		return this;
	}
	
	public PedidoVendaMinhaVersao comCliente(String nome, boolean isVip) {
		Cliente c = new Cliente(nome);
		if(isVip) {
			c.setVip(isVip);
		}else {
			c.setVip(isVip);
		}
		this.cliente = c;
		return this;
	}
	
	public PedidoVendaMinhaVersao comItemPedido(String nome, Integer quantidade, BigDecimal valorUnitario) {
		ItemPedido item = new ItemPedido();
		item.setNome(nome);
		item.setQuantidade(quantidade);
		item.setValorUnitario(valorUnitario);
		if( this.itensPedido == null ) {
			this.itensPedido = new ArrayList<ItemPedido>();
		}
		this.itensPedido.add(item);
		return this;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemPedido> getItensPedido() {
		return itensPedido;
	}

	public void setItensPedido(List<ItemPedido> itensPedido) {
		this.itensPedido = itensPedido;
	}

}
