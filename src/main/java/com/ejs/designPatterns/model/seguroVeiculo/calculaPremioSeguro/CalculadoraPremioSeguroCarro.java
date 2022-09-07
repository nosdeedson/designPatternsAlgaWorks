package com.ejs.designPatterns.model.seguroVeiculo.calculaPremioSeguro;

import com.ejs.designPatterns.model.seguroVeiculo.Cliente;
import com.ejs.designPatterns.model.seguroVeiculo.Sexo;

public class CalculadoraPremioSeguroCarro implements CalculadoraPremioSeguro{

    @Override
    public double calcular(Cliente cliente, double valorVeiculo) {

        if (Sexo.FEMININO.equals(cliente.getSexo())){
            return valorVeiculo * 0.01;
        }
        return valorVeiculo * 0.02;
    }
}
