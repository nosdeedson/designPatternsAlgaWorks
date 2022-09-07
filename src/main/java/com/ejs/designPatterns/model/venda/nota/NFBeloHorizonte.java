package com.ejs.designPatterns.model.venda.nota;

import java.time.LocalDate;

import com.ejs.designPatterns.model.venda.VendaDTO;

public class NFBeloHorizonte implements NotaFiscal {
	
	private Double valor;
	private LocalDate emissao;
	private Double imposto;

	public NFBeloHorizonte() {}
	
	public NFBeloHorizonte(Double valor, LocalDate emissao, Double imposto) {
		this.valor = valor;
		this.emissao = emissao;
		this.imposto = imposto;
	}

	@Override
	public NotaFiscal criarNota(VendaDTO dto) {
		NFBeloHorizonte nf = new NFBeloHorizonte();
		nf.valor = (double) (dto.getQtd() * 100);
		nf.emissao = LocalDate.now();
		nf.imposto = nf.valor * 0.1D;
		return nf;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getImposto() {
		return imposto;
	}

	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}

	public LocalDate getEmissao() {
		return emissao;
	}

	public void setEmissao(LocalDate emissao) {
		this.emissao = emissao;
	}
	

}
