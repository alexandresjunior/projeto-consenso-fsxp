package poo.questao16;

public class Destinatario extends Email{
    private int emailDestinatario;

    public Destinatario buscar(){
        Destinatario d = new Destinatario();
        System.out.println("classe: Destinatario, método: buscar()");
        return d;
    }

    public void adicionar(){
        System.out.println("classe: Destinatario, método: adicionar");
    }
    public void apagar(){
        System.out.println("classe: Destinatario, método: apagar");
    }

}
