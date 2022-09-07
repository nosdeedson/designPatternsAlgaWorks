package com.ejs.designPatterns.model.venda.boleto;

import com.ejs.designPatterns.model.venda.nota.NotaFiscal;

public interface Boleto {
	
	public Boleto criar(NotaFiscal nf);
}
