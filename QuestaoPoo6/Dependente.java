package QuestaoPoo6;

import java.util.Date;

public class Dependente extends Funcionario {

    private int sequencial;
    private String nomeCompleto;
    private Date dataNascimento;
    private Integer sexo;
    private boolean participarPlano;

    private Funcionario funcionarioProvedor;



    public Dependente(){
        super();

    }

    public int getSequencial() {
        return sequencial;
    }

    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

    public boolean isParticiparPlano() {
        return participarPlano;
    }

    public void setParticiparPlano(boolean participarPlano) {
        this.participarPlano = participarPlano;
    }

    public String getFuncionarioProvedor() {
        return funcionarioProvedor.getNomeCompleto();
    }

    public void setFuncionarioProvedor(Funcionario funcionarioProvedor) {
        this.funcionarioProvedor = funcionarioProvedor;
    }
   
}

