package com.widemar.wsmeta.controladores;

import com.widemar.wsmeta.entidades.Venda;
import com.widemar.wsmeta.servicos.VendaServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/vendas")
public class VendaControlador {

    @Autowired
    private VendaServico servico;

    @GetMapping
    public Page<Venda> encontrarVendas(
            @RequestParam(value = "minData", defaultValue = "") String minData,
            @RequestParam(value = "maxData", defaultValue = "") String maxData,
            Pageable pageable) {
        return servico.encontrarVendas(minData, maxData, pageable);
    }
}
