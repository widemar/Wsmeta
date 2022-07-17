package com.widemar.wsmeta.servicos;

import com.widemar.wsmeta.entidades.Venda;
import com.widemar.wsmeta.repositorios.VendaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

@Service
public class VendaServico {

    @Autowired
    private VendaRepositorio repositorio;

    public Page<Venda> encontrarVendas(String minData, String maxData, Pageable pageable) {
        LocalDate hoje = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
        LocalDate min = minData.equals("") ? hoje.minusDays(365) :  LocalDate.parse(minData);
        LocalDate max = maxData.equals("") ? hoje : LocalDate.parse(maxData);
        return repositorio.encontrarVendas(min, max, pageable);
    }
}
