package com.marketservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.marketservices.model.Prestador;

public interface PrestadorRepository extends JpaRepository<Prestador, Long> {
}
