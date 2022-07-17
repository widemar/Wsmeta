package com.widemar.wsmeta.repositorios;

import com.widemar.wsmeta.entidades.Venda;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;

public interface VendaRepositorio extends JpaRepository<Venda, Long> {
    @Query("SELECT obj FROM Venda obj WHERE obj.date BETWEEN :min AND :max ORDER BY obj.amount DESC")
    Page<Venda> encontrarVendas(LocalDate min, LocalDate max, Pageable pageable);
}
