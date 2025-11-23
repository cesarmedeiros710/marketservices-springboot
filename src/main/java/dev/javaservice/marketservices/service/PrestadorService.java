package com.marketservices.service;

import com.marketservices.repository.PrestadorRepository;
import com.marketservices.model.Prestador;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestadorService {

    private final PrestadorRepository repository;

    public PrestadorService(PrestadorRepository repository) {
        this.repository = repository;
    }

    public Prestador salvar(Prestador p) {
        return repository.save(p);
    }

    public List<Prestador> listar() {
        return repository.findAll();
    }

    public Prestador buscar(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
