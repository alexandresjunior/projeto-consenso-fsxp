package TreinaRecifePoo15;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Juridica extends Pessoa {
	private String cnpj;
	private String inscricaoEstadual;
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
