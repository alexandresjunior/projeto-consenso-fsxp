package com.treina.recife.model;

import java.util.Calendar;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private Calendar dataNascimento;
    private boolean ativo;

    @OneToMany(cascade=CascadeType.PERSIST)
    private List<RedesSociais> redesSociais;

}
