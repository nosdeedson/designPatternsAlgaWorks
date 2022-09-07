package com.ejs.designPatterns.model.financeiro.observerExemplo;

public enum TipoLancamento {

    DESPESA("Despesa"),
    RECEITA("Receita");

    private String descricao;

    TipoLancamento(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
