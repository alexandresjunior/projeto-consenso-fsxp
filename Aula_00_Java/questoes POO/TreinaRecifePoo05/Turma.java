package TreinaRecifePoo05;

import java.util.ArrayList;
import java.util.List;


public class Turma {
	
	public String cod;
	public Integer turno;
	public Integer sala;
	
	private ArrayList<Aluno> listaDeAlunos;
	
	//List<Aluno> listaDeAlunos = new ArrayList<>();
	
	public Turma() {
		listaDeAlunos = new ArrayList<Aluno>();
	}
	
	public void adicionarAluno(Aluno aluno) {
		listaDeAlunos.add(aluno);
	}
	
	public List<String> getNomesLista(){
		List<String> nomesLista = new ArrayList<String>();
		for(Aluno b : listaDeAlunos) {
			nomesLista.add(b.getNome());
		}
		return nomesLista;
		
	}
	
	public int totalAlunos() {
		return  listaDeAlunos.size();
	}
	
	public void excluirAluno(Aluno aluno) {
		listaDeAlunos.remove(aluno);
		
	}
	
	
	public String getAlunoInfos(int posicao) {
		return listaDeAlunos.get(posicao).getAll();
		
	}
	public String getNomeAluno(int posicao) {
		return listaDeAlunos.get(posicao).getNome();
		
	}
	
	public Aluno getAluno(int posicao) {
		return listaDeAlunos.get(posicao);
		
	}
	
	
	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public Integer getTurno() {
		return turno;
	}

	public void setTurno(Integer turno) {
		this.turno = turno;
	}

	public Integer getSala() {
		return sala;
	}

	public void setSala(Integer sala) {
		this.sala = sala;
	}


	
}
