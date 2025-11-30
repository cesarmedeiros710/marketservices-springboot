package com.marketservices.service;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    public Prestador buscarPorId(Long id) {
        return prestadorRepository.findById(id).orElse(null);
    }

    public long contarPrestadores() {
        return prestadorRepository.count();
    }

    public long contarPrestadoresEmServico() {
        return prestadorRepository.countByEmServicoTrue();
    }

    public void deletarPrestador(Long id) {
        prestadorRepository.deleteById(id);
    }

    public Map<String, Long> contarPrestadoresPorFuncao() {
        List<Object[]> dados = prestadorRepository.contarPorFuncao();
        Map<String, Long> resultado = new HashMap<>();
        for (Object[] linha : dados) {
            String funcao = (String) linha[0];
            Long total = (Long) linha[1];
            resultado.put(funcao, total);
        }
        return resultado;
    }
}
