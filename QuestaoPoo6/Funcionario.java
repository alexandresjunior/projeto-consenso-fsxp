package QuestaoPoo6;

import java.util.ArrayList;
import java.util.Date;

public class Funcionario {

    private Integer matricula;
    private String nomeCompleto;
    private String cpf;
    private Date dataDeNascimento;
    private Integer sexo;
    private double salario;
    private int telefone;

    ArrayList <Dependente> listaDependentes;

    public Funcionario(){

        listaDependentes= new ArrayList<Dependente>();

    }

    public void adicionarDependente(Dependente dependente){
        listaDependentes.add(dependente);

    }


    public Integer getMatricula() {
        return matricula;
    }
    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    public Integer getSexo() {
        return sexo;
    }
    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
	
	
	
	
}
