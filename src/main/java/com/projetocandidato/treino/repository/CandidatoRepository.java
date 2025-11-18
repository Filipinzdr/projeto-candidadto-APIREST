package com.projetocandidato.treino.repository;

import com.projetocandidato.treino.domain.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatoRepository extends JpaRepository<Candidato, Long> {
}
