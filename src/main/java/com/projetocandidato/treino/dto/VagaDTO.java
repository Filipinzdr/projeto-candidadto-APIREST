package com.projetocandidato.treino.dto;

public class VagaDTO {
    private long id;
    private String titulo;
    private String habilidade;

    public VagaDTO() {
    }


    public VagaDTO(long id, String titulo, String habilidade) {
        this.id = id;
        this.titulo = titulo;
        this.habilidade = habilidade;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
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
