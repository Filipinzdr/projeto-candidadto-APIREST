package com.projetocandidato.treino.service;

import com.projetocandidato.treino.domain.Vaga;
import com.projetocandidato.treino.dto.VagaDTO;
import com.projetocandidato.treino.repository.VagaRepository;
import org.springframework.stereotype.Service;

@Service
public class VagaService {

    private final VagaRepository repo;

    public VagaService(VagaRepository repo) {
        this.repo = repo;
    }

    public Vaga inserir(VagaDTO vagaDTO){
        Vaga vaga = new Vaga();
        vaga.setTitulo(vagaDTO.getTitulo());
        vaga.setHabilidade(vagaDTO.getHabilidade());
        return repo.save(vaga);

    }
}
