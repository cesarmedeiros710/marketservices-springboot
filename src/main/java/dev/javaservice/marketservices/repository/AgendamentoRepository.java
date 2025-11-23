package com.marketservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.marketservices.model.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}
