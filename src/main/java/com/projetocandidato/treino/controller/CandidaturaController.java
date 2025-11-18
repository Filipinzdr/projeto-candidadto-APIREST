package com.projetocandidato.treino.controller;


import com.projetocandidato.treino.domain.Candidatura;
import com.projetocandidato.treino.dto.CandidaturaDTO;
import com.projetocandidato.treino.service.CandidatoService;
import com.projetocandidato.treino.service.CandidaturaService;
import com.projetocandidato.treino.service.VagaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidatura")
public class CandidaturaController {

    private final CandidaturaService candidaturaServ;


    public CandidaturaController(CandidaturaService candidaturaServ) {
        this.candidaturaServ = candidaturaServ;
    }

    @PostMapping
    public Candidatura inserir(@RequestBody CandidaturaDTO candidaturaDTO){
        return candidaturaServ.inserir(candidaturaDTO);

    }

    @GetMapping("/candidato/{candidatoId}/titulo")
    public List<String> findTitleByCandidatoId(@PathVariable Long candidatoId){
        return candidaturaServ.findTitleByCandidatoId(candidatoId);
    }

    @GetMapping("/vaga/{vagaId}/candidato")
    public List<String> findNameByVagaId(@PathVariable Long vagaId){
        return candidaturaServ.findNameByVagaId(vagaId);
    }


}
