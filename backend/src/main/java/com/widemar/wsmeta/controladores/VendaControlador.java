package com.widemar.wsmeta.controladores;

import com.widemar.wsmeta.entidades.Venda;
import com.widemar.wsmeta.servicos.VendaServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/vendas")
public class VendaControlador {

    @Autowired
    private VendaServico servico;

    @GetMapping
    public List<Venda> encontrarVendas() {
        return servico.encontrarVendas();
    }
}
