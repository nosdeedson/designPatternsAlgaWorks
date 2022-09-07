package com.ejs.designPatterns.model.cobranca;

public class CobrancaDTO {
	
	private double valor;
	private TipoCobranca tipo;
	private String status;
	private int parcelas;
	private String podeEmitir;
	
	
	public String getPodeEmitir() {
		return podeEmitir;
	}
	public void setPodeEmitir(String podeEmitir) {
		this.podeEmitir = podeEmitir;
	}
	public int getParcelas() {
		return parcelas;
	}
	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public TipoCobranca getTipo() {
		return tipo;
	}
	public void setTipo(TipoCobranca tipo) {
		this.tipo = tipo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "CobrancaDTO [valor=" + valor + ", tipo=" + tipo + ", status=" + status + "]";
	}
	
	

}
