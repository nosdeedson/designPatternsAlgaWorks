package com.ejs.designPatterns.model.venda.boleto;

import com.ejs.designPatterns.model.venda.nota.NFSaoPaulo;
import com.ejs.designPatterns.model.venda.nota.NotaFiscal;

import java.time.LocalDate;

public class BoletoCE implements Boleto {

	private String codigoBarras;
	private LocalDate emissao;
	private Double desconto;
	private Double valor;

	public BoletoCE (){}

	public BoletoCE(String codigoBarras, LocalDate emissao, Double desconto, Double valor) {
		this.codigoBarras = codigoBarras;
		this.emissao = emissao;
		this.desconto = desconto;
		this.valor = valor;
	}

	@Override
	public Boleto criar(NotaFiscal nf) {
		BoletoCE boletoCE = new BoletoCE();
		boletoCE.codigoBarras = "123456789";
		boletoCE.emissao = ((NFSaoPaulo) nf).getEmissao();
		boletoCE.desconto = 10D;
		boletoCE.valor = ((NFSaoPaulo) nf).getValor() - boletoCE.getDesconto();
		return boletoCE;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public LocalDate getEmissao() {
		return emissao;
	}

	public void setEmissao(LocalDate emissao) {
		this.emissao = emissao;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
}
