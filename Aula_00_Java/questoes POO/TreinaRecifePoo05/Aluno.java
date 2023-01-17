package TreinaRecifePoo05;

import java.util.Date;

public class Aluno {
	public String matricula;
	public String nome;
	public String cpf;
	public Date dataNascimento;
	public String sexo;
	public String endereco;
	public String cidade;
	public String uf;
	
	
	private Turma tumaDoAluno;

	public String getAll() {
		String all = nome +" " +" "+cpf+" "+matricula+" "+dataNascimento+" "+sexo+" "+endereco+" "+cidade+" "+uf;
		return all;
		
	}
	
	public void setTumaDoAluno(Turma tumaDoAluno) {
		this.tumaDoAluno = tumaDoAluno;
		tumaDoAluno.adicionarAluno(this);
	}
	
	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
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


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}


	public Turma getTumaDoAluno() {
		return tumaDoAluno;
	}


	
	
	
}
