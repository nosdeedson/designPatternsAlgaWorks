package com.ejs.designPatterns.business.abstractFactory;

import com.ejs.designPatterns.model.venda.sp.RealizarVendaSP;
import com.ejs.designPatterns.model.venda.sp.RealizarVendaSPFactory;
import org.springframework.stereotype.Service;

import com.ejs.designPatterns.model.venda.RealizarVenda;
import com.ejs.designPatterns.model.venda.RealizarVendaFactory;
import com.ejs.designPatterns.model.venda.VendaDTO;
import com.ejs.designPatterns.model.venda.VendaRealizada;
import com.ejs.designPatterns.model.venda.bh.RealizarVendaBH;
import com.ejs.designPatterns.model.venda.bh.RealizarVendaBHFactory;

@Service
public class VendaBusiness {

	public VendaRealizada criarVenda(VendaDTO dto) {
		VendaRealizada realizada = null;
		RealizarVenda venda = null;
		if (dto.getEstado().equals("MG")) {
			RealizarVendaFactory factory = new RealizarVendaBHFactory();
			venda = new RealizarVendaBH(factory);
		}else if ( "SP".equals(dto.getEstado())) {
			RealizarVendaFactory factorySP = new RealizarVendaSPFactory();
			venda = new RealizarVendaSP(factorySP);
		}
		realizada = venda.vender(dto);
		return realizada;
	}
}
