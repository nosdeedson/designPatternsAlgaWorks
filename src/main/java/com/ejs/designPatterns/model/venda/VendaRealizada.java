package com.ejs.designPatterns.model.venda;

import com.ejs.designPatterns.model.venda.boleto.Boleto;
import com.ejs.designPatterns.model.venda.nota.NotaFiscal;

public class VendaRealizada {
	private NotaFiscal nf;
	private Boleto boleto;

	public VendaRealizada() {}
	
	public VendaRealizada(NotaFiscal nf, Boleto boleto) {
		this.nf = nf;
		this.boleto = boleto;
	}

	public NotaFiscal getNf() {
		return nf;
	}

	public void setNf(NotaFiscal nf) {
		this.nf = nf;
	}

	public Boleto getBoleto() {
		return boleto;
	}

	public void setBoleto(Boleto boleto) {
		this.boleto = boleto;
	}
	
}
