package com.projetocandidato.treino.repository;

import com.projetocandidato.treino.domain.Candidatura;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidaturaRepository extends JpaRepository<Candidatura, Long> {
    List<Candidatura> findByCandidatoId(Long candidatoId);
    List<Candidatura> findByVagaId(Long vagaId);
}
