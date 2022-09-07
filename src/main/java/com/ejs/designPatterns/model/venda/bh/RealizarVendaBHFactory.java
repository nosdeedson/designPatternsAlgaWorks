package com.ejs.designPatterns.model.venda.bh;

import com.ejs.designPatterns.model.venda.RealizarVendaFactory;
import com.ejs.designPatterns.model.venda.boleto.Boleto;
import com.ejs.designPatterns.model.venda.boleto.BoletoBB;
import com.ejs.designPatterns.model.venda.nota.NFBeloHorizonte;
import com.ejs.designPatterns.model.venda.nota.NotaFiscal;

public class RealizarVendaBHFactory implements RealizarVendaFactory {

	@Override
	public NotaFiscal criarNotaFiscal() {
		return new NFBeloHorizonte();
	}

	@Override
	public Boleto criarBoleto() {
		return new BoletoBB();
	}

}
