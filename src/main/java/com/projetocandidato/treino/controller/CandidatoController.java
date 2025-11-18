package com.projetocandidato.treino.controller;

import com.projetocandidato.treino.domain.Candidato;
import com.projetocandidato.treino.dto.CandidatoDTO;
import com.projetocandidato.treino.service.CandidatoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidato")
public class CandidatoController {

    private final CandidatoService serv;

    public CandidatoController(CandidatoService serv) {
        this.serv = serv;
    }


    @PostMapping
    public Candidato inserir(@RequestBody CandidatoDTO candidato) {
        return serv.inserir(candidato);
    }
}
