package com.projetocandidato.treino.dto;

public class CandidatoDTO {
    private Long id;
    private String nome;
    private String habilidade;

    public CandidatoDTO() {
    }

    public CandidatoDTO(String habilidade, String nome, Long id) {
        this.habilidade = habilidade;
        this.nome = nome;
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
