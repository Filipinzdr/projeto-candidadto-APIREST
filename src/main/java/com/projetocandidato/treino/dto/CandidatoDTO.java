package com.projetocandidato.treino.dto;

public class CandidatoDTO {
    private long id;
    private String nome;
    private String habilidade;

    public CandidatoDTO() {
    }

    public CandidatoDTO(String habilidade, String nome, long id) {
        this.habilidade = habilidade;
        this.nome = nome;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }
}
