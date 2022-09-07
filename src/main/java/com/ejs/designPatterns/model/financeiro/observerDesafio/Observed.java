package com.ejs.designPatterns.model.financeiro.observerDesafio;

import java.util.Set;

public interface Observed {

    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notification();
}
