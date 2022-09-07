package com.ejs.designPatterns.business.builder;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.ejs.designPatterns.model.pedidoVenda.PedidoVenda;
import com.ejs.designPatterns.model.pedidoVenda.PedidoVendaMinhaVersao;
import com.ejs.designPatterns.model.pedidoVenda.buildersVersaoAlgaworks.PedidoVendaBuilder;

@Service
public class PedidoVendaBusinnes {
	
	public PedidoVenda pedidoVenda() {
		PedidoVenda pedido = new PedidoVendaBuilder()
				.comClienteNormal("joao")
				.comItemPedido("tv", 2, new BigDecimal(10))
				.comNumero("123456")
				.construir();
		return pedido;
	}
	
	public PedidoVendaMinhaVersao pedidoVendaMinhaVersao() {
		PedidoVendaMinhaVersao pedido = new PedidoVendaMinhaVersao()
				.comCliente("pedro", true)
				.comItemPedido("tv", 2, new BigDecimal(10))
				.comItemPedido("celular", 1, new BigDecimal(2000))
				.comNumero("123456")
				.construir();
		return pedido;
	}

}
