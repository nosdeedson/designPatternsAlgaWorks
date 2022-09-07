package com.ejs.designPatterns.model.seguroVeiculo.calculaPremioSeguro;

import com.ejs.designPatterns.model.seguroVeiculo.Cliente;

public interface CalculadoraPremioSeguro {
    public double calcular(Cliente cliente, double valorVeiculo);
}
