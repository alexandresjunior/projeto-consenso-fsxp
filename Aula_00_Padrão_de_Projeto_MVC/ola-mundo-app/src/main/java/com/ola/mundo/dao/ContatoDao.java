package com.ola.mundo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.ola.mundo.model.Contato;

public class ContatoDao {

    private List<Contato> lista = new ArrayList<>();

    public ContatoDao() {
        Contato contato1 = new Contato();

        contato1.setNome("Alexandre de Souza Jr.");
        contato1.setEmail("alexandre@dev.com");
        contato1.setEndereco("Rua ABC, n. 123");
        contato1.setDataNascimento(LocalDate.of(1995, 1, 8));

        lista.add(contato1);

        Contato contato2 = new Contato();

        contato2.setNome("Rogério Aguiar");
        contato2.setEmail("rogerio@dev.com");
        contato2.setEndereco("Rua DEF, n. 456");
        contato2.setDataNascimento(LocalDate.of(1962, 1, 8));

        lista.add(contato2);
    }

    public List<Contato> getLista() {
        return this.lista;
    }

}
