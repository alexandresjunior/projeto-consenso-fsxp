package Exer16;

import java.util.ArrayList;
import java.util.List;

public class Email {
    private int NomeDoEmail;
    private Texto texto;
    private Destinatario destinatario;
    public void Escrever(){}
    public void Excluir(){}
    public void Anexar(){}
    public void Responder(){}
    Email(Texto texto, int NomeDoEmail){
        this.texto = texto;
        this.NomeDoEmail = NomeDoEmail;
    }
    private List<Destinatario> destinatarios;
    public Email(ArrayList<Destinatario> destinatario){
        destinatario = new ArrayList<Destinatario>();
        destinatarios.addAll(destinatario);
    }

}
