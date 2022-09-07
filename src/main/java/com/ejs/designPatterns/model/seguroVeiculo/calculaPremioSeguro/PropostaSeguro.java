package com.ejs.designPatterns.model.seguroVeiculo.calculaPremioSeguro;

import com.ejs.designPatterns.model.seguroVeiculo.Cliente;
import com.ejs.designPatterns.model.seguroVeiculo.TipoVeiculo;

public class PropostaSeguro {

    private CalculadoraPremioSeguro calculadoraPremioSeguro;
    private Cliente cliente;

    private double valorVeiculo;

    public PropostaSeguro(Cliente cliente, double valorVeiculo) {
        this.cliente = cliente;
        this.valorVeiculo = valorVeiculo;
    }

    public String gerar(){
        double valor = this.calculadoraPremioSeguro.calcular(this.cliente, this.valorVeiculo);
        return String.format("%s o valor mensal a ser pago é %f", this.cliente.getNome(), valor);
    }

    public void setCalculadoraPremioSeguro(CalculadoraPremioSeguro calculadoraPremioSeguro) {
        this.calculadoraPremioSeguro = calculadoraPremioSeguro;
    }
}
