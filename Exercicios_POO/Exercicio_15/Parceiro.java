package Exercicio_15;

public class Parceiro {
	
	private String tipoPessoa;
	private float desempenho;
	
	

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public float getDesempenho() {
		return desempenho;
	}

	public void setDesempenho(float desempenho) {
		this.desempenho = desempenho;
	}

	public void cadastrar() {
		System.out.println("classe: Parceiro , método: Cadastrar");
	}

	public void bloquear() {
		System.out.println("classe: Parceiro , método: Bloquear");

	}

	public void excluir() {
		System.out.println("classe: Parceiro , método: Excluir");
	}

}

