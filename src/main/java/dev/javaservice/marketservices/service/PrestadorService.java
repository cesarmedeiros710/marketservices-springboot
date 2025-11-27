package com.marketservices.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.marketservices.model.Prestador;
import com.marketservices.repository.PrestadorRepository;

@Service
public class PrestadorService {

    private final PrestadorRepository prestadorRepository;

    public PrestadorService(PrestadorRepository prestadorRepository) {
        this.prestadorRepository = prestadorRepository;
    }

    public List<Prestador> findAll() {
        return prestadorRepository.findAll();
    }

    public Prestador save(Prestador prestador) {
        return prestadorRepository.save(prestador);
    }
    public long contarPrestadores() {
        return prestadorRepository.count();
    }

    public long contarPrestadoresEmServico() {
        return prestadorRepository.countByEmServicoTrue();
    }

}
