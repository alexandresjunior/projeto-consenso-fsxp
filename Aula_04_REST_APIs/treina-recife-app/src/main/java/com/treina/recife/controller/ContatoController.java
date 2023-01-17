package com.treina.recife.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.treina.recife.model.Contato;
import com.treina.recife.service.ContatoService;

@RestController
public class ContatoController {
    
    @PostMapping("/contatos")
    public Contato criarNovoContato(@RequestBody Contato contato) {
        return contatoService.save(contato);
    }

    @GetMapping("/contatos")
    public List<Contato> obterTodosContatos() {
        return contatoService.findAll();
    }

    @GetMapping("/contatos/{id}")
    public Contato obterContatoPeloId(@PathVariable("id") long id) {
        return contatoService.findById(id).get();
    }

    @DeleteMapping("/contatos/{id}")
    public String deletarContatoPeloId(@PathVariable("id") long id) {
        contatoService.deleteById(id);

        return "Contato deletado com sucesso!";
    }

    @PutMapping("/contatos")
    public Contato atualizarContato(@RequestBody Contato contato) {
        Contato contatoBD = contatoService.findById(contato.getId()).get();

        contatoBD.setNome(contato.getNome());
        contatoBD.setSobrenome(contato.getSobrenome());
        contatoBD.setAltura(contato.getAltura());
        contatoBD.setIdade(contato.getIdade());
        contatoBD.setAtivo(contato.isAtivo());
        contatoBD.setDataNascimento(contato.getDataNascimento());

        contatoBD = contatoService.save(contatoBD);

        return contatoBD;
    }

    @Autowired
    private ContatoService contatoService;

}
