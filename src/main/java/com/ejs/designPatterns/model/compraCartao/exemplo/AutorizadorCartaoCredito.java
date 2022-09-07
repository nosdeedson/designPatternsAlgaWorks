package com.ejs.designPatterns.model.compraCartao.exemplo;

public interface AutorizadorCartaoCredito {

    public void autorizar(Cliente cliente, CartaoCredito cartaoCredito, Double valor);
}
