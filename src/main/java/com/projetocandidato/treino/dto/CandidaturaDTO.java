package com.projetocandidato.treino.dto;

import com.projetocandidato.treino.domain.Candidato;
import com.projetocandidato.treino.domain.Vaga;

public class CandidaturaDTO {
    private Long id;
    private Candidato candidato;
    private Vaga vaga;


    public CandidaturaDTO(Long id, Candidato candidato, Vaga vaga) {
        this.id = id;
        this.candidato = candidato;
        this.vaga = vaga;
    }

    public CandidaturaDTO() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }
}
