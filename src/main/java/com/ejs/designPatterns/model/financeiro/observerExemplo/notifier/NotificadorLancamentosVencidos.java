package com.ejs.designPatterns.model.financeiro.observerExemplo.notifier;

import com.ejs.designPatterns.model.financeiro.observerExemplo.Lancamento;
import com.ejs.designPatterns.model.financeiro.observerExemplo.listener.Listener;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NotificadorLancamentosVencidos implements Notificador{

    private Set<Listener> listeners;
    private List<Lancamento> lancamentosVencidos;

    public NotificadorLancamentosVencidos(){
        this.listeners = new HashSet<>();
    }

    @Override
    public void registrarListener(Listener listener) {
        this.listeners.add(listener);
    }

    @Override
    public void removerListener(Listener listener) {
        this.listeners.remove(listener);
    }

    @Override
    public void notificarListener() {
        for (Listener listener: listeners){
            listener.atulaizar();
        }
    }

    @Override
    public void novosLancamentoVencidos(List<Lancamento> lancamentosVencidos) {
        this.lancamentosVencidos = lancamentosVencidos;
        this.notificarListener();
    }

    @Override
    public List<Lancamento> getLancamentosVencidos() {
        return this.lancamentosVencidos;
    }
}
