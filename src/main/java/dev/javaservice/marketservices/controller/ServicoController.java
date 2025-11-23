package com.marketservices.controller;

import com.marketservices.model.Servico;
import com.marketservices.service.ServicoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ServicoController {

    private final ServicoService service;

    public ServicoController(ServicoService service) {
        this.service = service;
    }

    @PostMapping
    public Servico criar(@RequestBody Servico servico) {
        return service.salvar(servico);
    }

    @GetMapping
    public List<Servico> listar() {
        return service.listar();
    }
}
