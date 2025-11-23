package com.marketservices.service;

import com.marketservices.model.Agendamento;
import com.marketservices.model.Prestador;
import com.marketservices.model.Servico;
import com.marketservices.repository.AgendamentoRepository;
import com.marketservices.repository.PrestadorRepository;
import com.marketservices.repository.ServicoRepository;
import org.springframework.stereotype.Service;

@Service
public class AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;
    private final PrestadorRepository prestadorRepository;
    private final ServicoRepository servicoRepository;

    public AgendamentoService(
            AgendamentoRepository agendamentoRepository,
            PrestadorRepository prestadorRepository,
            ServicoRepository servicoRepository) {

        this.agendamentoRepository = agendamentoRepository;
        this.prestadorRepository = prestadorRepository;
        this.servicoRepository = servicoRepository;
    }

    public Agendamento agendar(Long prestadorId, Long servicoId, Agendamento dados) {

        Prestador prestador = prestadorRepository.findById(prestadorId)
                .orElseThrow(() -> new RuntimeException("Prestador não encontrado"));

        Servico servico = servicoRepository.findById(servicoId)
                .orElseThrow(() -> new RuntimeException("Serviço não encontrado"));

        dados.setPrestador(prestador);
        dados.setServico(servico);

        return agendamentoRepository.save(dados);
    }
}
