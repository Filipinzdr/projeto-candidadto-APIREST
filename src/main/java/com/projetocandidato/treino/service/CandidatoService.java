package com.projetocandidato.treino.service;

import com.projetocandidato.treino.domain.Candidato;
import com.projetocandidato.treino.dto.CandidatoDTO;
import com.projetocandidato.treino.repository.CandidatoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class CandidatoService {

    private final CandidatoRepository repo;

    public CandidatoService(CandidatoRepository repo) {
        this.repo = repo;
    }

    public Candidato inserir(CandidatoDTO candidatoDTO){
        Candidato candidato = new Candidato();
        candidato.setNome(candidatoDTO.getNome());
        candidato.setHabilidade(candidatoDTO.getHabilidade());
        return repo.save(candidato);
    }





}
