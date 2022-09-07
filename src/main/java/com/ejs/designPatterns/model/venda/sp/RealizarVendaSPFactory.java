package com.ejs.designPatterns.model.venda.sp;

import com.ejs.designPatterns.model.venda.RealizarVendaFactory;
import com.ejs.designPatterns.model.venda.boleto.Boleto;
import com.ejs.designPatterns.model.venda.boleto.BoletoCE;
import com.ejs.designPatterns.model.venda.nota.NFSaoPaulo;
import com.ejs.designPatterns.model.venda.nota.NotaFiscal;

public class RealizarVendaSPFactory implements RealizarVendaFactory {

    @Override
    public NotaFiscal criarNotaFiscal() {
        return new NFSaoPaulo();
    }

    @Override
    public Boleto criarBoleto() {
        return new BoletoCE();
    }
}
