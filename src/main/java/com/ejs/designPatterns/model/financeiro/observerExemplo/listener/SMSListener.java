package com.ejs.designPatterns.model.financeiro.observerExemplo.listener;

import com.ejs.designPatterns.model.financeiro.observerExemplo.Lancamento;
import com.ejs.designPatterns.model.financeiro.observerExemplo.notifier.Notificador;

import java.util.List;

public class SMSListener implements Listener{

    private Notificador notificador;

    public SMSListener(Notificador notificador){
        this.notificador = notificador;
        this.notificador.registrarListener(this);
    }

    @Override
    public void atulaizar() {
        List<Lancamento> lancamentosVencidos = this.notificador.getLancamentosVencidos();
        for (Lancamento lancamento: lancamentosVencidos){
            System.out.println("Enviando SMS para: " + lancamento.getPessoa().getTelefone());
        }
    }
}
