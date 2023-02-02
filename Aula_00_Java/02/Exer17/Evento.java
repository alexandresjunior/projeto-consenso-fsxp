package Exer17;

import java.sql.Time;

import javax.xml.crypto.Data;

public class Evento {
    private String nome, descricao;
    private Data dataInico, dataFim;
    private Time horaIniciom, horaFim;
    private NivelPrioridade nivelPrioridade;
    public void compartilharEvento(){
        
    }
    public Evento(String nome, String descricao, Data dataInico, Data dataFim, Time horaIniciom, Time horaFim, NivelPrioridade nivelPrioridade) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInico = dataInico;
        this.dataFim = dataFim;
        this.horaIniciom = horaIniciom;
        this.horaFim = horaFim;
        this.nivelPrioridade = nivelPrioridade;
    }
    
}
