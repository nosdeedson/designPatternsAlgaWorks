package com.ejs.designPatterns.model.venda;

import com.ejs.designPatterns.model.venda.boleto.Boleto;
import com.ejs.designPatterns.model.venda.nota.NotaFiscal;

public interface RealizarVendaFactory {

	public NotaFiscal criarNotaFiscal();
	public Boleto criarBoleto();
}
