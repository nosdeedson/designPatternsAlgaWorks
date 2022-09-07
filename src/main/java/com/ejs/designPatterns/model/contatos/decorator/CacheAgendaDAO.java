package com.ejs.designPatterns.model.contatos.decorator;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class CacheAgendaDAO implements Agenda{

    private Map<Integer, Contato> contatos;
    private Agenda agenda;

    public CacheAgendaDAO(Agenda agenda) {
        this.contatos = new HashMap<>();
        this.agenda = agenda;
    }

    @Override
    public void inserir(Contato contato) throws IOException {
        int codigo = 1;
        try {
            do {
                contato = this.agenda.buscar(codigo);
                if( Optional.ofNullable(contato).isPresent()){
                    this.contatos.put(codigo, contato);
                }
                codigo++;
            }while (Optional.ofNullable(contato).isPresent());
        } catch (RuntimeException e){
            e.printStackTrace();
        }

    }

    @Override
    public Contato buscar(Integer codigo) {
        Contato contato = this.contatos.get(codigo);
        if(contato == null){
            throw new RuntimeException("Nenhum contato encontrado com o código: " + codigo);
        }
        return contato;
    }
}
