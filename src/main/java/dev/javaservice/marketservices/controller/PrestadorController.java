package com.marketservices.controller;

import com.marketservices.model.Prestador;
import com.marketservices.service.PrestadorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prestadores")
public class PrestadorController {

    private final PrestadorService prestadorService;

    public PrestadorController(PrestadorService prestadorService) {
        this.prestadorService = prestadorService;
    }

    @PostMapping
    public Prestador salvar(@RequestBody Prestador prestador) {
        return prestadorService.save(prestador);
    }

    @GetMapping
    public List<Prestador> listar() {
        return prestadorService.findAll();
    }

    @GetMapping("/{id}")
    public Prestador buscar(@PathVariable Long id) {
        return prestadorService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        prestadorService.deletarPrestador(id);
    }
}
