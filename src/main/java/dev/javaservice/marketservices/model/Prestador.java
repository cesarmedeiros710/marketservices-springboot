package com.marketservices.model;

import jakarta.persistence.*;

@Entity
@Table(name = "prestadores")
public class Prestador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String telefone;
    private String servico;
    private boolean emServico;

    public boolean isEmServico() {
        return emServico;
    }

    public void setEmServico(boolean emServico) {
        this.emServico = emServico;
    }

    public Prestador() {}

    public Prestador(Long id, String nome, String telefone, String servico,  boolean emServico) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.servico = servico;
        this.emServico =  emServico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
