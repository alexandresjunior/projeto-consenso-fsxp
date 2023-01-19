package Exercicio_16;

public class Email {

	private int nomeDoEmail;

	public void escrever() {
		System.out.println("classe: Email, método: escrever()");
	}

	public void excluir() {
		System.out.println("classe: Email, método: excluir()");
	}

	public void anexar() {
		System.out.println("classe: Email, método: anexar()");
	}

	public void responder() {
		System.out.println("classe: Email, método: responder()");
	}

	public int getNomeDoEmail() {
		return nomeDoEmail;
	}

	public void setNomeDoEmail(int nomeDoEmail) {
		this.nomeDoEmail = nomeDoEmail;
	}
}

