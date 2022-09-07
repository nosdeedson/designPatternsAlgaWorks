package com.ejs.designPatterns.model.cobranca;

public abstract class Cobranca {
	
	protected abstract void emitir(CobrancaDTO cobrancaDTO);
	
	public String emitirGenerico(CobrancaDTO cobrancaDTO) {
		
		if(cobrancaDTO.getPodeEmitir().equals("pode")) {
			this.emitir(cobrancaDTO);
			return "emitida";
		}
		
		return "não pode";
	}

}
