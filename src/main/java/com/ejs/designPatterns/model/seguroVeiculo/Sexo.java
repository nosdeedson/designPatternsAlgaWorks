package com.ejs.designPatterns.model.seguroVeiculo;

public enum Sexo {

    MASCULINO(1),
    FEMININO(2);

    private Integer codigo;

    Sexo(Integer codigo) {
        this.codigo = codigo;
    }
}
