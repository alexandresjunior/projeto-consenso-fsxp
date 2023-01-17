package TreinaRecifePoo06;

public class Main {
 public static void main(String[] args) {
	
	 Funcionario f1 = new Funcionario();
	 f1.setNomeCompleto("joao das neves");
	 f1.setTelefone(999999);
	 
	 Dependente d1 = new Dependente();
	 d1.setNomeCompleto("juca das torre");
	 d1.setParticipaPlano(true);
	 d1.setFuncionarioProvedor(f1);
	 
	 Dependente d2 = new Dependente();
	 d2.setNomeCompleto("mama das torre");
	 d2.setParticipaPlano(true);
	 d2.setFuncionarioProvedor(f1);
	 
	 Dependente d3 = new Dependente();
	 d3.setNomeCompleto("didi das torre");
	 d3.setParticipaPlano(true);
	 d3.setFuncionarioProvedor(f1);
	 
	 
	 System.out.println(f1.getNomeCompleto());
	 System.out.println(d1.getFuncionarioProvedor());
	 System.out.println(f1.getNomesDependentes());
}
}
