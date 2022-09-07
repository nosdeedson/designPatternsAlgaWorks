package com.ejs.designPatterns.controller;

import com.ejs.designPatterns.business.decorator.ContatoDecoratorBusiness;
import com.ejs.designPatterns.business.proxy.ContatoBusiness;
import com.ejs.designPatterns.model.contatos.decorator.Contato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URISyntaxException;

@RestController
@RequestMapping("contatos")
public class ContatoController {

    @Autowired
    private ContatoBusiness contatoBusiness;

    @Autowired
    private ContatoDecoratorBusiness contatoDecoratorBusiness;

    @GetMapping("{email}")
    public String getNome(@PathVariable("email") String email) throws IOException, URISyntaxException {
//        return  contatoBusiness.getNome(email);
//        no caso o beneficio do proxy é que nem todos os arquivos são carregados devido ao código criado
        /*portanto o mesmo pode ser feito para se fazer alguma validação antes de instanciar a classe
        * que realmente faz o processamento. Se fosse um serviço remoto o mesmo não seria invocado
        * */
        return  contatoBusiness.getNomeUsandoProxy(email);
    }

    @GetMapping("by-codigo")
    public ResponseEntity<?> getContato(@RequestParam("codigo") Integer codigo){
        try {
            Contato contato = this.contatoDecoratorBusiness.getContato(codigo);
            return ResponseEntity.ok(contato);
        }catch (RuntimeException e){
            return ResponseEntity.ok(e.getMessage());
        }
    }

    @GetMapping("by-cache")
    public ResponseEntity<?> getContatoCache(@RequestParam("codigo") Integer codigo){
        try {
            Contato contato = this.contatoDecoratorBusiness.fromCache(codigo);
            return ResponseEntity.ok(contato);
        }catch (RuntimeException | IOException e){
            return ResponseEntity.ok(e.getMessage());
        }
    }

    @PostMapping
    public String addContato(@RequestBody Contato contato) throws IOException {
        String xml = this.contatoDecoratorBusiness.addContato(contato);
        return xml;
    }
}
