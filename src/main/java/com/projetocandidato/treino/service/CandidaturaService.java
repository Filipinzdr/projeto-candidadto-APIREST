package com.projetocandidato.treino.service;

import com.projetocandidato.treino.domain.Candidato;
import com.projetocandidato.treino.domain.Candidatura;
import com.projetocandidato.treino.dto.CandidatoDTO;
import com.projetocandidato.treino.dto.CandidaturaDTO;
import com.projetocandidato.treino.repository.CandidatoRepository;
import com.projetocandidato.treino.repository.CandidaturaRepository;
import com.projetocandidato.treino.repository.VagaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


@Service
public class CandidaturaService {
    private final CandidaturaRepository candidaturaRepo;
    private final CandidatoRepository candidatoRepo;
    private final VagaRepository vagaRepo;

    public CandidaturaService(CandidaturaRepository candidaturaRepo, CandidatoRepository candidatoRepo, VagaRepository vagaRepo) {
        this.candidaturaRepo = candidaturaRepo;
        this.candidatoRepo = candidatoRepo;
        this.vagaRepo = vagaRepo;
    }

    public Candidatura inserir(CandidaturaDTO candidaturaDTO){
        var candidato = candidatoRepo.findById(candidaturaDTO.getCandidato().getId()).orElseThrow(() -> new NoSuchElementException("não existe esse candidato"));
        var vaga = vagaRepo.findById(candidaturaDTO.getVaga().getId()).orElseThrow(() -> new NoSuchElementException("não existe essa vaga"));

        Candidatura candidatura = new Candidatura();
        candidatura.setCandidato(candidato);
        candidatura.setVaga(vaga);
        return candidaturaRepo.save(candidatura);
    }


    public List<String> findTitleByCandidatoId(Long candidatoId){
        var candidaturas = candidaturaRepo.findByCandidatoId(candidatoId);
        ArrayList<String> titulos = new ArrayList<>();
        for(Candidatura c : candidaturas){
            titulos.add(c.getVaga().getTitulo());
        }
        return titulos;
    }


    public List<String> findNameByVagaId(Long vagaId) {
        var candidaturas = candidaturaRepo.findByVagaId(vagaId);

        ArrayList<String> nomes = new ArrayList<>();

        for (Candidatura c : candidaturas){
            nomes.add(c.getCandidato().getNome());
        }

        return nomes;


    }


}
