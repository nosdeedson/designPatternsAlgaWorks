package com.ejs.designPatterns.model.venda.nota;

import java.time.LocalDate;

import com.ejs.designPatterns.model.venda.VendaDTO;

public class NFSaoPaulo implements NotaFiscal{
	
	private Double valor;
	private LocalDate emissao;
	private Double imposto;

	public NFSaoPaulo() {}
	
	public NFSaoPaulo(Double valor, LocalDate emissao, Double imposto) {
		this.valor = valor;
		this.emissao = emissao;
		this.imposto = imposto;
	}

	@Override
	public NotaFiscal criarNota(VendaDTO dto) {
		NFSaoPaulo nfSaoPaulo = new NFSaoPaulo();
		nfSaoPaulo.emissao = LocalDate.now();
		nfSaoPaulo.valor = dto.getQtd() * 100D;
		nfSaoPaulo.imposto = dto.getQtd() * 100D * 0.5D;
		return nfSaoPaulo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public LocalDate getEmissao() {
		return emissao;
	}

	public void setEmissao(LocalDate emissao) {
		this.emissao = emissao;
	}

	public Double getImposto() {
		return imposto;
	}

	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}
}
