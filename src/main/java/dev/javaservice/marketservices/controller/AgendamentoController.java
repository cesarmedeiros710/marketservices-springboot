package com.marketservices.controller;

import com.marketservices.model.Agendamento;
import com.marketservices.service.AgendamentoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {

    private final AgendamentoService service;

    public AgendamentoController(AgendamentoService service) {
        this.service = service;
    }

    @PostMapping("/{prestadorId}/{servicoId}")
    public Agendamento criar(
            @PathVariable Long prestadorId,
            @PathVariable Long servicoId,
            @RequestBody Agendamento dados) {

        return service.agendar(prestadorId, servicoId, dados);
    }
}
