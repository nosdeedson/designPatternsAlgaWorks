package com.ejs.designPatterns.model.financeiro.observerDesafio;

import com.thoughtworks.xstream.XStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

@Service
public class ProcessarPedido {

    @Autowired
    private ReservarEntrega reserverEntrega;

    public List<Pedido> processar() throws FileNotFoundException {
        File file = new File(this.getClass().getClassLoader().getResource("pedidos.xml").getFile());
        InputStream inputStream = new FileInputStream(file);
        XStream xStream = new XStream();
        xStream.allowTypes(new Class[] {Pedido.class, List.class});
        xStream.alias("pedidos", List.class);
        xStream.alias("pedido", Pedido.class);

        List<Pedido> pedidos = (List<Pedido>) xStream.fromXML(inputStream);
        return  pedidos;
    }
}
