package Exer15;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Fisica extends Pessoa{
    private String cpf, rg, genero;
    private Date nasc;
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Date getNasc() {
        return nasc;
    }
    public void setNasc(Date nasc) {
        this.nasc = nasc;
    }
    private List<Parceiro> parceiros;
    public Fisica(){}
    public Fisica(Parceiro parceiro){
        parceiros = new ArrayList<Parceiro>();
        parceiros.add(parceiro);
    }
}
