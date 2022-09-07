package com.ejs.designPatterns.business.decorator;

import com.ejs.designPatterns.model.compraCartao.exemplo.*;
import org.springframework.stereotype.Service;

import java.time.YearMonth;
import java.util.Scanner;

@Service
public class CompraCartaoBusiness {

    public void comprarCartato(CompraCartaoDTO dto) {
        Cliente cliente = dto.getCliente();
        CartaoCredito cartaoCredito = dto.getCartaoCredito();
        Double valor = dto.getValor();

        AutorizadorCartaoCredito autorizador = new AnalisadorDeRiscoClearSale(new AutorizadorCielo());
        autorizador.autorizar(cliente, cartaoCredito, valor);
    }

}
