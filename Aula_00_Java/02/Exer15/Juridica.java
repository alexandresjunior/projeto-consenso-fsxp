package Exer15;

import java.sql.Date;
import java.util.List;
import java.util.ArrayList;

public class Juridica extends Pessoa{
    private String cnpj, inscricaoEstadual;
    private Date fundacao;
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }
    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    public Date getFundacao() {
        return fundacao;
    }
    public void setFundacao(Date fundacao) {
        this.fundacao = fundacao;
    }
    private List<Parceiro> parceiros;
    public Juridica(){}
    public Juridica(Parceiro parceiro){
        parceiros = new ArrayList<Parceiro>();
        parceiros.add(parceiro);
    }
}
