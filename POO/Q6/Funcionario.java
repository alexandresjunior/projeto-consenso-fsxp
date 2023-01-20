package POO.Q6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Funcionario {
	private Integer matricula;
	private String nomeCompleto;
	private String cpf;
	private Date dataNascimento;
	private Integer sexo;
	private double salario;
	private int telefone;
	private List<Dependente> dependentes = new ArrayList<>();
	
	public Funcionario() {}


	public Funcionario(Integer matricula, String nomeCompleto, String cpf, Date dataNascimento, Integer sexo,
			double salario, int telefone, List<Dependente> dependentes) {
		super();
		this.matricula = matricula;
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.salario = salario;
		this.telefone = telefone;
		this.dependentes = dependentes;
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
