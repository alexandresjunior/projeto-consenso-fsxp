package ExerciciosPOO.Questao17;

import java.net.URL;

public class Pessoa {

    private String nome;
    private String cpf;
    private URL foto;
    private String email;
    private Usuario nlogin;
    private Disciplina disciplinas;
    private Amigo amigos;
    private Evento eventos;

    
    Pessoa(String nome, String cpf, URL foto, Amigo amigo, String email,Disciplina disciplina, Evento evento, Usuario usuario) {
        this.nome = nome;
        this.cpf = cpf;
        this.foto = foto;
        this.email = email;
        this.nlogin = usuario;
        this.amigos = amigo;
        this.eventos = evento;
        this.disciplinas = disciplina;
    }
    public Usuario getNlogin() {
        return nlogin;
    }
    public void setNlogin(Usuario nlogin) {
        this.nlogin = nlogin;
    }
    public Disciplina getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(Disciplina disciplinas) {
        this.disciplinas = disciplinas;
    }
    public Amigo getAmigos() {
        return amigos;
    }
    public void setAmigos(Amigo amigos) {
        this.amigos = amigos;
    }
    public Evento getEventos() {
        return eventos;
    }
    public void setEventos(Evento eventos) {
        this.eventos = eventos;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public URL getFoto() {
        return foto;
    }
    public void setFoto(URL foto) {
        this.foto = foto;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    
    
}
