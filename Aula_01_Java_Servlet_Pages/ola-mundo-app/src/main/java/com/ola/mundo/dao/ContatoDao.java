package com.ola.mundo.dao;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import com.ola.mundo.model.Contato;

public class ContatoDao {

    private List<Contato> lista = new ArrayList<>();

    public ContatoDao() {
        Contato contato1 = new Contato();

        contato1.setNome("Alexandre de Souza Jr.");
        contato1.setEmail("alexandre@dev.com");
        contato1.setEndereco("Rua ABC, n. 123");
        contato1.setDataNascimento(new GregorianCalendar(1995, 1, 8));

        lista.add(contato1);

        Contato contato2 = new Contato();

        contato2.setNome("Rogério Aguiar");
        contato2.setEmail("rogerio@dev.com");
        contato2.setEndereco("Rua DEF, n. 456");
        contato2.setDataNascimento(new GregorianCalendar(1962, 1, 8));

        lista.add(contato2);

        Contato contato3 = new Contato();

        contato3.setNome("Rebeca Valgueiro");
        contato3.setEndereco("Rua GHI, n. 789");
        contato3.setDataNascimento(new GregorianCalendar(1995, 1, 8));

        lista.add(contato3);

        Contato contato4 = new Contato();

        contato4.setNome("Edilene Valgueiro");
        contato4.setEmail("edilene@dev.com");
        contato4.setDataNascimento(new GregorianCalendar(1962, 1, 8));

        lista.add(contato4);
    }

    public List<Contato> getLista() {
        return this.lista;
    }

}
