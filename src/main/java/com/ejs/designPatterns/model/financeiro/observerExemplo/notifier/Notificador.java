package com.ejs.designPatterns.model.financeiro.observerExemplo.notifier;

import com.ejs.designPatterns.model.financeiro.observerExemplo.Lancamento;
import com.ejs.designPatterns.model.financeiro.observerExemplo.listener.Listener;

import java.util.List;

public interface Notificador {

    public void registrarListener(Listener listener);
    public void removerListener(Listener listener);
    public void notificarListener();

    public void novosLancamentoVencidos(List<Lancamento> lancamentosVencidos);
    public List<Lancamento> getLancamentosVencidos();

}
