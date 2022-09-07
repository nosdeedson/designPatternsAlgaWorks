package com.ejs.designPatterns.model.frete.exemplo;

public class Normal implements Frete{
    @Override
    public double calcularPreco(int distancia) {
        return distancia * 1.25 + 10;
    }
}
