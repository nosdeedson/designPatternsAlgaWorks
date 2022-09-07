package com.ejs.designPatterns.model.compraCartao.exemplo;

import java.time.YearMonth;

public class AnalisadorDeRiscoClearSale implements AutorizadorCartaoCredito{

    private AutorizadorCartaoCredito cartaoCredito;

    public AnalisadorDeRiscoClearSale(AutorizadorCartaoCredito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    @Override
    public void autorizar(Cliente cliente, CartaoCredito cartaoCredito, Double valor) {
        if (cliente.getCpf().startsWith("111") || cartaoCredito.getVencimento().isBefore(YearMonth.now())
                || valor > 500) {
            throw new RiscoCreditoException("Possível fraude, negando pagamento!");
        }

        this.cartaoCredito.autorizar(cliente, cartaoCredito, valor);
    }
}
