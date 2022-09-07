package com.ejs.designPatterns.model.financeiro.observerExemplo.repository;

import com.ejs.designPatterns.model.financeiro.observerExemplo.Lancamento;
import com.ejs.designPatterns.model.financeiro.observerExemplo.Pessoa;
import com.ejs.designPatterns.model.financeiro.observerExemplo.TipoLancamento;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Lancamentos {

    public List<Lancamento> todosVencidos() {

        Lancamento l1 = new Lancamento()
                .withCodigo(1L)
                .withDataVencimento(Date.from(Instant.now()))
                .withDescricao("Mesa tabaco MDF")
                .withTipoLancamento(TipoLancamento.DESPESA)
                .withValor(new BigDecimal(10))
                .withPessao(new Pessoa(1L, "João Silva", "joao@email", "9999-8888"))
                .build();

        Lancamento l2 = new Lancamento()
                .withCodigo(2L)
                .withDataVencimento(Date.from(Instant.now()))
                .withDescricao("Armario MDF 3X2,4")
                .withValor(new BigDecimal(200))
                .withPessao(new Pessoa(2L, "Renato Santos", "renato@email", "8888-9999"))
                .withTipoLancamento(TipoLancamento.DESPESA)
                .build();

        return Arrays.asList(l1, l2);
    }



}
