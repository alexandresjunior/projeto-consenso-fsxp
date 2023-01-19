package Exercicio_16;

public class Arquivos extends Email {
	
	private String nomeArquivo;
	private int tamanho;
	private String formato;

	public void anexar() {
		System.out.println("classe: Arquivos, método: anexar()");
	}

	public void remover() {
		System.out.println("classe: Arquivos, método: remover()");
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

}
