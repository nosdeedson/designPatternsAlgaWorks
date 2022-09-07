package com.ejs.designPatterns.model.venda.bh;

import com.ejs.designPatterns.model.venda.RealizarVenda;
import com.ejs.designPatterns.model.venda.RealizarVendaFactory;
import com.ejs.designPatterns.model.venda.VendaDTO;
import com.ejs.designPatterns.model.venda.VendaRealizada;
import com.ejs.designPatterns.model.venda.boleto.Boleto;
import com.ejs.designPatterns.model.venda.nota.NotaFiscal;

public class RealizarVendaBH implements RealizarVenda {
	
	private NotaFiscal nf;
	private Boleto boleto;
	
	public RealizarVendaBH(RealizarVendaFactory factory) {
		this.nf = factory.criarNotaFiscal();
		this.boleto = factory.criarBoleto();
	}
	
	@Override
	public VendaRealizada vender(VendaDTO dto) {
		nf =  this.nf.criarNota(dto);
		boleto = this.boleto.criar(this.nf);
		VendaRealizada realizada = new VendaRealizada(nf, boleto);
		return realizada;
	}
	
	

}
