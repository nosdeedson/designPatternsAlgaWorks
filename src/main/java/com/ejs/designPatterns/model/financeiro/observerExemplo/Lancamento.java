package com.ejs.designPatterns.model.financeiro.observerExemplo;

import java.math.BigDecimal;
import java.util.Date;

public class Lancamento {

    private Long codigo;
    private Pessoa pessoa;
    private String descricao;
    private BigDecimal valor;
    private TipoLancamento tipo;
    private Date dataVencimento;

    public Lancamento withCodigo(Long codigo){
        this.codigo = codigo;
        return this;
    }

    public Lancamento withPessao(Pessoa pessoa){
        this.pessoa = pessoa;
        return this;
    }

    public Lancamento withDescricao(String descricao){
        this.descricao = descricao;
        return this;
    }

    public Lancamento withValor( BigDecimal valor){
        this.valor = valor;
        return this;
    }

    public Lancamento withTipoLancamento(TipoLancamento tipo){
        this.tipo = tipo;
        return this;
    }

    public Lancamento withDataVencimento(Date dataVencimento){
        this.dataVencimento = dataVencimento;
        return this;
    }

    public Lancamento build(){
        Lancamento lancamento = new Lancamento();
        lancamento.tipo = this.tipo;
        lancamento.valor = this.valor;
        lancamento.pessoa = this.pessoa;
        lancamento.codigo = this.codigo;
        lancamento.descricao = this.descricao;
        lancamento.dataVencimento = this.dataVencimento;
        return lancamento;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public TipoLancamento getTipo() {
        return tipo;
    }

    public void setTipo(TipoLancamento tipo) {
        this.tipo = tipo;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lancamento that = (Lancamento) o;
        return codigo.equals(that.codigo);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( (codigo == null) ? 0 : codigo.hashCode());
        return  result;
    }
}
