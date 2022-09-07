package com.ejs.designPatterns.business.decorator;

import com.ejs.designPatterns.model.contatos.decorator.Agenda;
import com.ejs.designPatterns.model.contatos.decorator.AgendaDAO;
import com.ejs.designPatterns.model.contatos.decorator.CacheAgendaDAO;
import com.ejs.designPatterns.model.contatos.decorator.Contato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ContatoDecoratorBusiness {

    @Autowired
    private Agenda agenda;

    public String addContato(Contato contato) throws IOException {
        this.agenda.inserir(contato);
        return "adicinado";
    }

    public Contato getContato(Integer codigo){
        Contato contato = this.agenda.buscar(codigo);
        return contato;
    }

    public Contato fromCache(Integer codigo) throws IOException {
        Agenda agenda = new CacheAgendaDAO(new AgendaDAO());
        agenda.inserir(null);
        return agenda.buscar(codigo);
    }
}
