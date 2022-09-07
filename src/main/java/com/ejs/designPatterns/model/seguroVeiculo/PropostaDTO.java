package com.ejs.designPatterns.model.seguroVeiculo;

import java.io.Serializable;

public class PropostaDTO implements Serializable {

    private String nome;

    private int idade;

    private Sexo sexo;

    private TipoVeiculo tipoVeiculo;

    private Double valorVeiculo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public Double getValorVeiculo() {
        return valorVeiculo;
    }

    public void setValorVeiculo(Double valorVeiculo) {
        this.valorVeiculo = valorVeiculo;
    }
}
