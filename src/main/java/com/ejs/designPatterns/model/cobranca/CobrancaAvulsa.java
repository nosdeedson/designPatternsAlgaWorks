package com.ejs.designPatterns.model.cobranca;

public class CobrancaAvulsa extends Cobranca {

	@Override
	public void emitir(CobrancaDTO cobrancaDTO) {
		System.out.println("emitindo cobrança avulsa");
		System.out.println(cobrancaDTO.getValor());
		cobrancaDTO.setStatus("emtitida");
		System.out.println(cobrancaDTO.toString());
	}

}
