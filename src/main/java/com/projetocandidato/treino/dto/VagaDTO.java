package com.projetocandidato.treino.dto;

public class VagaDTO {
    private Long id;
    private String titulo;
    private String habilidade;

    public VagaDTO() {
    }


    public VagaDTO(Long id, String titulo, String habilidade) {
        this.id = id;
        this.titulo = titulo;
        this.habilidade = habilidade;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }
}
