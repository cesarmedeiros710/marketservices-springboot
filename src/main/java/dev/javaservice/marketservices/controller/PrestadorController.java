package com.marketservices.controller;

import com.marketservices.model.Prestador;
import com.marketservices.service.PrestadorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class PrestadorController {

    private final PrestadorService service;

    public PrestadorController(PrestadorService service) {
        this.service = service;
    }

    @PostMapping
    public Prestador criar(@RequestBody Prestador p) {
        return service.salvar(p);
    }

    @GetMapping
    public List<Prestador> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Prestador buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.excluir(id);
    }
}
