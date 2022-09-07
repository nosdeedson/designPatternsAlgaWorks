package com.ejs.designPatterns.model.financeiro.observerDesafio;

import org.springframework.stereotype.Service;

@Service
public class ReservarEntrega implements Observer{

    private String caminhao;

    public void reservarCaminhao(){
        System.out.println("Caminhão pequeno reservado para a entrega.");
    }

    public String getCaminhao() {
        return caminhao;
    }

    public void setCaminhao(String caminhao) {
        this.caminhao = caminhao;
    }

    @Override
    public void updateStatus() {
        this.reservarCaminhao();
    }
}
