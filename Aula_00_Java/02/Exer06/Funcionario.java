package Exer06;

import java.sql.Date;

public class Funcionario {
    private Integer matricula, sexo;
    private String nomeCompleto, cpf;
    private Date dataNascimento;
    private double salario;
    private int telefone;
    private List<Dependente> dependentes;
    public Funcionario(){dependentes = new ArrayList<Dependente>}
    public void adicionarDependente(Dependente dependete) {dependentes.add(dependete)}; 
}
