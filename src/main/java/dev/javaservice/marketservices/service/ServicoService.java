package com.marketservices.service;

import com.marketservices.model.Servico;
import com.marketservices.repository.ServicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoService {

    private final ServicoRepository repository;

    public ServicoService(ServicoRepository repository) {
        this.repository = repository;
    }

    public Servico salvar(Servico s) {
        return repository.save(s);
    }

    public List<Servico> listar() {
        return repository.findAll();
    }
}
