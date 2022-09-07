package com.ejs.designPatterns.model.seguroVeiculo;

import java.io.Serializable;

public class Cliente implements Serializable {

    private String nome;
    private Integer idade;

    private Sexo sexo;

    public Cliente(PropostaDTO dto) {
        this.nome = dto.getNome();
        this.idade = dto.getIdade();
        this.sexo = dto.getSexo();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}
