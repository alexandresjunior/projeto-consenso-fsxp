package com.treina.recife.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.treina.recife.model.DadosPessoais;
import com.treina.recife.service.DadosPessoaisService;

@RestController
public class DadosPessoaisController {

    @PostMapping("/dados")
    public DadosPessoais salvarDados(@RequestBody DadosPessoais dados) {
        return dadosPessoaisService.save(dados);
    }

    @GetMapping("/dados/{contatoId}")
    public DadosPessoais obterDadosPeloContatoId(@PathVariable("contatoId") long contatoId) {
        return dadosPessoaisService.findByContatoId(contatoId);
    }

    @Autowired
    private DadosPessoaisService dadosPessoaisService;

}
