package com.ejs.designPatterns.model.venda;

public class VendaDTO {
	
	private String estado;
	private String produto;
	private int qtd;
	
	public VendaDTO() {	}
	
	public VendaDTO(String estado, String produto, int qtd) {
		this.estado = estado;
		this.produto = produto;
		this.qtd = qtd;
	}



	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	

}
