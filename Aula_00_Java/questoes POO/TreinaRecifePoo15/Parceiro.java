package TreinaRecifePoo15;

public class Parceiro {
	private String tipoPessoa;
	private float desempenho;
	
	private Juridica juridica = new Juridica();
	private Fisica fisica = new Fisica();
	
	
	public void cadastrar() {
		System.out.println("Parceiro cadastrar");
	}
	public void bloquear() {
		System.out.println("bloquer Parceiro");
	}
	public void excluir() {
		System.out.println("excluir Parceiro");
	}
}
