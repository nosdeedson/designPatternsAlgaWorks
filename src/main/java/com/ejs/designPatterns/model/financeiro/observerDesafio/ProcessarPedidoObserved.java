package com.ejs.designPatterns.model.financeiro.observerDesafio;

import java.util.HashSet;
import java.util.Set;

public class ProcessarPedidoObserved implements Observed{
    private Set<Observer> observers;

    public ProcessarPedidoObserved(){
        this.observers = new HashSet<>();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notification() {
        for( Observer observer: observers){
            observer.updateStatus();
        }
    }
}
