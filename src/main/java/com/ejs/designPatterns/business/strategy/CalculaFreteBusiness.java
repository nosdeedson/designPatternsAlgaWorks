package com.ejs.designPatterns.business.strategy;

import com.ejs.designPatterns.model.frete.exemplo.Frete;
import com.ejs.designPatterns.model.frete.exemplo.TipoFrete;
import org.springframework.stereotype.Service;

@Service
public class CalculaFreteBusiness {

    public double calcularFrete(Integer distancia, TipoFrete tipoFrete){
        Frete frete = tipoFrete.obterFrete();
        double valorFrete = frete.calcularPreco(distancia);
        return valorFrete;
    }
}
