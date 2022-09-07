package com.ejs.designPatterns.model.frete.exemplo;

public class Sedex implements Frete{
    @Override
    public double calcularPreco(int distancia) {
        return distancia * 1.45 + 12;
    }
}