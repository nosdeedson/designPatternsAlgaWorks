package com.ejs.designPatterns.business.factoryMethod;

import org.springframework.stereotype.Service;

import com.ejs.designPatterns.model.cobranca.Cobranca;
import com.ejs.designPatterns.model.cobranca.CobrancaAvulsa;
import com.ejs.designPatterns.model.cobranca.CobrancaDTO;
import com.ejs.designPatterns.model.cobranca.CobrancaMensalidade;
import com.ejs.designPatterns.model.cobranca.CobrancaParcelada;

@Service
public class CobrancaBusiness {
	
	public String emitir(CobrancaDTO cobranca) {
		String emissao = "";
		
		switch (cobranca.getTipo().toString()) {
		case "AVULSA": {
			Cobranca avulsa = new  CobrancaAvulsa();
			emissao = avulsa.emitirGenerico(cobranca);
			return emissao;
		}
		case "PARCELADA":{
			Cobranca parcelada = new CobrancaParcelada();
			emissao = parcelada.emitirGenerico(cobranca);
			return emissao;
		}
		case "MENSALIDADE":{
			Cobranca mensalidade = new CobrancaMensalidade();
			emissao = mensalidade.emitirGenerico(cobranca);
			return emissao;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + cobranca.toString());
		}
		
	}

}
