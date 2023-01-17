package TreinaRecifePoo06;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Funcionario {
	private Integer matricula;
	private String nomeCompleto;
	private String cpf;
	private Date dataNascimento;
	private Integer sexo;
	private int telefone;
	
	private ArrayList<Dependente> listaDependentes;
	
	
	
	public Funcionario() {
		listaDependentes = new ArrayList<Dependente>();
	}
	
	public void adicionarDependente(Dependente dependente) {
		listaDependentes.add(dependente);
		
	}

	public List<String> getNomesDependentes() {
		List<String> nomeDependentes = new ArrayList<String>();
		for(Dependente d : listaDependentes) {
			nomeDependentes.add(d.getNomeCompleto());
		}
		return nomeDependentes;
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

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	
	
	
}
