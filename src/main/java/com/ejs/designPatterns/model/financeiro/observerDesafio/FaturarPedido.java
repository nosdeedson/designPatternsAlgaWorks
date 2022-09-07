package com.ejs.designPatterns.model.financeiro.observerDesafio;

import java.util.List;

public class FaturarPedido implements Observer{

    private List<Pedido> pedidos;

    public FaturarPedido(List<Pedido> pedidos){
        this.pedidos = pedidos;
    }

    public void faturar(){
        Double total = 0D;
        for (Pedido pedido: pedidos){
            total += pedido.getValor();
        }
        System.out.println("Valor total do pedido: " +  total);
    }

    @Override
    public void updateStatus() {
        this.faturar();
    }
}
