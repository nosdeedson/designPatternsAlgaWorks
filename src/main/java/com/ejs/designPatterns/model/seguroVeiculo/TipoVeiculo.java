package com.ejs.designPatterns.model.seguroVeiculo;

import com.ejs.designPatterns.model.seguroVeiculo.calculaPremioSeguro.CalculadoraPremioSeguro;
import com.ejs.designPatterns.model.seguroVeiculo.calculaPremioSeguro.CalculadoraPremioSeguroCarro;
import com.ejs.designPatterns.model.seguroVeiculo.calculaPremioSeguro.CalculadoraPremioSeguroMoto;

public enum TipoVeiculo {
    CARRO{
        @Override
        public CalculadoraPremioSeguro getTipoPremioSeguro(){
            return new CalculadoraPremioSeguroCarro();
        }
    },
    MOTO{
        @Override
        public CalculadoraPremioSeguro getTipoPremioSeguro(){
            return new CalculadoraPremioSeguroMoto();
        }
    };

    public abstract CalculadoraPremioSeguro getTipoPremioSeguro();
}
