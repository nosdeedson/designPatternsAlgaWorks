package com.ejs.designPatterns.model.cobranca;

import java.util.ArrayList;
import java.util.List;

public class CobrancaParcelada extends Cobranca {

	@Override
	public void emitir(CobrancaDTO cobrancaDTO) {
		List<CobrancaDTO> cobrancas = new ArrayList<CobrancaDTO>();
		for (int i = 0; i < cobrancaDTO.getParcelas(); i++) {
			CobrancaDTO nova = cobrancaDTO;			
			System.out.println("emitindo cobrança avulsa");
			System.out.println(nova.getValor());
			if(i == 0 ) {				
				nova.setStatus("emtitida");
			}else {
				nova.setStatus("agendada");
			}
			System.out.println(nova.toString());
			cobrancas.add(nova);
		}
	}

}
