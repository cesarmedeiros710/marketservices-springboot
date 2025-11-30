package com.marketservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.marketservices.model.Prestador;

import java.util.List;

public interface PrestadorRepository extends JpaRepository<Prestador, Long> {

    long countByEmServicoTrue();

    @Query("SELECT p.servico AS servico, COUNT(p) AS total FROM Prestador p GROUP BY p.servico")
    List<Object[]> contarPorFuncao();
}
