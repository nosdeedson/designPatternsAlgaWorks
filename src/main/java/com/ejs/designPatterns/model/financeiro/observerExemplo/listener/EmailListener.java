package com.ejs.designPatterns.model.financeiro.observerExemplo.listener;

import com.ejs.designPatterns.model.financeiro.observerExemplo.Lancamento;
import com.ejs.designPatterns.model.financeiro.observerExemplo.notifier.Notificador;

import java.util.List;

public class EmailListener implements Listener {

    private Notificador notificador;

    public EmailListener(Notificador notificador){
        this.notificador = notificador;
        this.notificador.registrarListener(this);
    }

    @Override
    public void atulaizar() {
        List<Lancamento> lancamentosVencidos = this.notificador.getLancamentosVencidos();
        for (Lancamento lancamento: lancamentosVencidos){
            System.out.println("Enviando email para: " + lancamento.getPessoa().getEmail());
        }
    }
}
