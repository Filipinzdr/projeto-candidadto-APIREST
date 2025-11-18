package com.projetocandidato.treino.controller;

import com.projetocandidato.treino.domain.Vaga;
import com.projetocandidato.treino.dto.VagaDTO;
import com.projetocandidato.treino.service.VagaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vaga")
public class VagaController {
    private final VagaService serv;

    public VagaController(VagaService serv) {
        this.serv = serv;
    }


    @PostMapping
    public Vaga inserir(@RequestBody VagaDTO vagaDTO){
        return serv.inserir(vagaDTO);
    }

}
