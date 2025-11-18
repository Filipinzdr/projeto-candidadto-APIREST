package com.projetocandidato.treino.domain;


import jakarta.persistence.*;

@Entity
@Table(name = "java_candidatura")
public class Candidatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "candidato_id", foreignKey = @ForeignKey(name = "candidato_fk"))
    private Candidato candidato;

    @ManyToOne
    @JoinColumn(name = "vaga_id", foreignKey = @ForeignKey(name = "vaga_fk"))
    private Vaga vaga;

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

    public Candidatura() {
    }
}
