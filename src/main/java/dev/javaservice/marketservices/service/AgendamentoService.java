package com.marketservices.service;

import com.marketservices.model.Agendamento;
import com.marketservices.repository.AgendamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendamentoService {

    private final AgendamentoRepository repo;

    public AgendamentoService(AgendamentoRepository repo) {
        this.repo = repo;
    }

    public List<Agendamento> findAll() {
        return repo.findAll();
    }

    public Agendamento save(Agendamento agendamento) {
        return repo.save(agendamento);
    }

    public long contarAgendamentos() {
        return repo.count();
    }

}
