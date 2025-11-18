package com.projetocandidato.treino.dto;

import com.projetocandidato.treino.domain.Candidato;
import com.projetocandidato.treino.domain.Vaga;

public class CandidaturaDTO {
    private long id;
    private Candidato candidato;
    private Vaga vaga;


    public CandidaturaDTO(long id, Candidato candidato, Vaga vaga) {
        this.id = id;
        this.candidato = candidato;
        this.vaga = vaga;
    }

    public CandidaturaDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
