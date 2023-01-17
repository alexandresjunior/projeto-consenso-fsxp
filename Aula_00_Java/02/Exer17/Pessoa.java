package Exer17;

import java.net.URI;

class Pessoa {
    String nome;
    String cpf;
    URI foto;
    String email;
    Usuario usuario;
    Amigo amigo;
    Disciplina disciplina;
    Evento evento;

    Pessoa(String nome, String cpf, URI foto, Amigo amigo, String email,Disciplina disciplina, Evento evento, Usuario usuario) {
        this.nome = nome;
        this.cpf = cpf;
        this.foto = foto;
        this.email = email;
        this.usuario = usuario;
        this.amigo = amigo;
        this.evento = evento;
        this.disciplina = disciplina;
    }
}