package com.ejs.designPatterns.business.strategy;

import com.ejs.designPatterns.model.seguroVeiculo.Cliente;
import com.ejs.designPatterns.model.seguroVeiculo.PropostaDTO;
import com.ejs.designPatterns.model.seguroVeiculo.calculaPremioSeguro.CalculadoraPremioSeguro;
import com.ejs.designPatterns.model.seguroVeiculo.calculaPremioSeguro.PropostaSeguro;
import org.springframework.stereotype.Service;

@Service
public class CalculaPremioSeguroBusiness {

    public String calcularPropostaSeguro(PropostaDTO dto){
        CalculadoraPremioSeguro seguro = dto.getTipoVeiculo().getTipoPremioSeguro();
        Cliente cliente = new Cliente(dto);
        PropostaSeguro propostaSeguro = new PropostaSeguro(cliente, dto.getValorVeiculo());
        propostaSeguro.setCalculadoraPremioSeguro(seguro);
        String proposta = propostaSeguro.gerar();
        return  proposta;
    }
}
