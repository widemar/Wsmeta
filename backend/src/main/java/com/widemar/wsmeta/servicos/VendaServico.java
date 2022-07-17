package com.widemar.wsmeta.servicos;

import com.widemar.wsmeta.entidades.Venda;
import com.widemar.wsmeta.repositorios.VendaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendaServico {

    @Autowired
    private VendaRepositorio repositorio;

    public List<Venda> encontrarVendas() {
        return repositorio.findAll();
    }
}
