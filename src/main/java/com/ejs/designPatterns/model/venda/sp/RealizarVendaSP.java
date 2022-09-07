package com.ejs.designPatterns.model.venda.sp;

import com.ejs.designPatterns.model.venda.RealizarVenda;
import com.ejs.designPatterns.model.venda.RealizarVendaFactory;
import com.ejs.designPatterns.model.venda.VendaDTO;
import com.ejs.designPatterns.model.venda.VendaRealizada;
import com.ejs.designPatterns.model.venda.boleto.Boleto;
import com.ejs.designPatterns.model.venda.nota.NotaFiscal;

public class RealizarVendaSP implements RealizarVenda {

    private NotaFiscal nf;
    private Boleto boleto;

    public RealizarVendaSP( RealizarVendaFactory factory) {
        this.nf = factory.criarNotaFiscal();
        this.boleto = factory.criarBoleto();
    }

    @Override
    public VendaRealizada vender(VendaDTO dto) {
        this.nf = this.nf.criarNota(dto);
        this.boleto = this.boleto.criar(this.nf);
        return new VendaRealizada(nf, boleto);
    }
}
