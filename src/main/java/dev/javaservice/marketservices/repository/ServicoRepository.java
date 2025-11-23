package com.marketservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.marketservices.model.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
}
