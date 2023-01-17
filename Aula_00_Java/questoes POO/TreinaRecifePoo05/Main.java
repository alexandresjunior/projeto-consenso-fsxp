package TreinaRecifePoo05;

public class Main {
 public static void main(String[] args) {
	Turma turma1 = new Turma();
	turma1.setSala(200);
	turma1.setTurno(2);
	
	
	 
	 
	Aluno aluno1 = new Aluno();
	aluno1.setCidade("olinda");
	aluno1.setNome("joao");
	aluno1.setMatricula("uf100");
	aluno1.setTumaDoAluno(turma1);
	
	
	Aluno aluno2 = new Aluno();
	aluno2.setCidade("faf");
	aluno2.setNome("pedro");
	aluno2.setMatricula("uf200");
	aluno2.setTumaDoAluno(turma1);
	
	 
	System.out.println(turma1.totalAlunos());
	System.out.println(turma1.getNomesLista());
	
	
}
}
