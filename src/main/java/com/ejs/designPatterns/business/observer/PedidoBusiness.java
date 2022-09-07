package com.ejs.designPatterns.business.observer;

import com.ejs.designPatterns.model.financeiro.observerDesafio.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.List;

@Service
public class PedidoBusiness {

    @Autowired
    private ProcessarPedido processarPedido;

    public List<Pedido> getPedidos() throws FileNotFoundException {
        ProcessarPedidoObserved observed = new ProcessarPedidoObserved();
        List<Pedido> pedidos = processarPedido.processar();
        FaturarPedido faturarPedido = new FaturarPedido(pedidos);
        ReservarEntrega reservarEntrega = new ReservarEntrega();
        SalvarPedidosBD salvarPedidosBD = new SalvarPedidosBD(pedidos);
        observed.addObserver(salvarPedidosBD);
        observed.addObserver(faturarPedido);
        observed.addObserver(reservarEntrega);
        observed.notification();
        return pedidos;
    }
}
