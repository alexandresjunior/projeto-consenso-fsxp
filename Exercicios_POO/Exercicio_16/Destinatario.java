package Exercicio_16;

public class Destinatario extends Email{
    
	private int emailDestinatario;

	public Destinatario buscar() {
		Destinatario d = new Destinatario();
		System.out.println("classe: Destinatario, metodo: buscar()");
		return d;
	}

	public void adicionar() {
		System.out.println("classe: Destinatario, metodo: adicionar");
	}

	public void apagar() {
		System.out.println("classe: Destinatario, metodo: apagar");
	}

	public int getEmailDestinatario() {
		return emailDestinatario;
	}

	public void setEmailDestinatario(int emailDestinatario) {
		this.emailDestinatario = emailDestinatario;
	}

}
