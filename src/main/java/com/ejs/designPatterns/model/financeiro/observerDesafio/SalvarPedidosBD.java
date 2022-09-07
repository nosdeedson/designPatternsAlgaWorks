package com.ejs.designPatterns.model.financeiro.observerDesafio;

import java.util.List;

public class SalvarPedidosBD implements Observer{

    private List<Pedido> pedidos;

    public SalvarPedidosBD(List<Pedido> pedidos){
        this.pedidos = pedidos;
    }

    private void salvarPedidosRepository(){
        for ( Pedido pedido: pedidos) {
            System.out.println("Salvando pedido: " + pedido.getDescricao());
        }
    }

    @Override
    public void updateStatus() {
        this.salvarPedidosRepository();
    }
}
