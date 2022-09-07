package com.ejs.designPatterns.business.observer;

import com.ejs.designPatterns.model.financeiro.observerExemplo.Lancamento;
import com.ejs.designPatterns.model.financeiro.observerExemplo.listener.EmailListener;
import com.ejs.designPatterns.model.financeiro.observerExemplo.listener.Listener;
import com.ejs.designPatterns.model.financeiro.observerExemplo.listener.SMSListener;
import com.ejs.designPatterns.model.financeiro.observerExemplo.notifier.Notificador;
import com.ejs.designPatterns.model.financeiro.observerExemplo.notifier.NotificadorLancamentosVencidos;
import com.ejs.designPatterns.model.financeiro.observerExemplo.repository.Lancamentos;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LancamentosBusiness {

    public List<Lancamento> lancamentosVencidos(){
        Notificador notificador = new NotificadorLancamentosVencidos();

        Listener emailListener = new EmailListener(notificador);
        Listener smsListener = new SMSListener(notificador);

        Lancamentos lancamentos = new Lancamentos();

        List<Lancamento> lancamentosVencidos = lancamentos.todosVencidos();
        if(lancamentosVencidos.size() > 0){
            notificador.novosLancamentoVencidos(lancamentosVencidos);
        }
        return lancamentosVencidos;
    }
}
