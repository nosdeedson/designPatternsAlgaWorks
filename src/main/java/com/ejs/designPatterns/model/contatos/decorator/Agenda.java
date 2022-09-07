package com.ejs.designPatterns.model.contatos.decorator;

import java.io.IOException;

public interface Agenda {
    public void inserir(Contato contato) throws IOException;
    public Contato buscar(Integer codigo);
}
