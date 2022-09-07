package com.ejs.designPatterns.model.venda.boleto;

import java.time.LocalDate;

import com.ejs.designPatterns.model.venda.nota.NFBeloHorizonte;
import com.ejs.designPatterns.model.venda.nota.NotaFiscal;

public class BoletoBB implements Boleto {

	private String codigoBarras;
	private Double valor;
	private LocalDate emissao;
	private Double imposto;
	
	public BoletoBB() {}
	
	public BoletoBB(String codigoBarras, Double valor, LocalDate emissao, Double imposto) {
		this.codigoBarras = codigoBarras;
		this.valor = valor;
		this.emissao = emissao;
		this.imposto = imposto;
	}

	@Override
	public Boleto criar(NotaFiscal nf) {
		NFBeloHorizonte nfBH = (NFBeloHorizonte) nf;
		BoletoBB boleto = new BoletoBB();
		boleto.codigoBarras = "123456789";
		boleto.valor = nfBH.getValor();
		boleto.emissao = LocalDate.now();
		boleto.imposto = nfBH.getImposto();
		return boleto;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
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
