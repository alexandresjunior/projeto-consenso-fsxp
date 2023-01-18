import java.util.Scanner;
public class Exercicio10 {
    public static void main (String[]args) {
        int ano , mes , dias;

        Scanner entrada = new Scanner(System.in) ;
	    System.out.println("Digite seus dias vividos: " );
        dias = entrada.nextInt();
        
        ano = dias / 365;
        dias %= 365;

        mes = dias/30;
        dias %= 30;

        System.out.println(ano+"ano(s)\n"+mes+"mês(es)\n"+dias+"dia(s)");
        entrada.close();
    }
}