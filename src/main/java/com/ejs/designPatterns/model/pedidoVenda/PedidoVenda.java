package com.ejs.designPatterns.model.pedidoVenda;

import java.util.ArrayList;
import java.util.List;

public class PedidoVenda {
	
	private String numero;
	
	private Cliente cliente;
	
	List<ItemPedido> itensPedido;

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

	public void setItensPedido(ItemPedido itensPedido) {
		if(this.itensPedido == null) {
			this.itensPedido = new ArrayList<ItemPedido>();
		}
		this.itensPedido.add(itensPedido);
	}

}
