import java.util.Scanner;

public class Exercicio05 {
    public static void main (String[]args) {
    int valor1;
	int valor2;
	int valor3;
	Scanner entrada = new Scanner(System.in) ;
	System.out.println("Digite um valor: " );
    valor1 = entrada.nextInt();
	System.out.println("Digite um valor: " );
    valor2 = entrada.nextInt();
	System.out.println("Digite um valor: " );
    valor3 = entrada.nextInt();
	


    if ((valor1 > valor2) && (valor1 > valor3) && (valor2 > valor3)) {
    	System.out.println("\n" + valor3+ "\n" + valor2 + "\n" + valor1 );
    }
    else if ((valor1 > valor2) && (valor1 > valor3) && (valor3 > valor2)) {
    	System.out.println("\n" + valor2+ "\n" + valor3 + "\n" + valor1 );
    }
    else if ((valor2 > valor1) && (valor2 > valor3) && (valor3 > valor1)) {
    	System.out.println("\n" + valor1+ "\n" + valor3 + "\n" + valor2 );
    }
    else if ((valor2 > valor1) && (valor2 > valor3) && (valor1 > valor3)) {
    	System.out.println("\n" + valor3+ "\n" + valor1 + "\n" + valor2 );
    }
    else if ((valor3 > valor1) && (valor3 > valor2) && (valor2 > valor1)) {
        System.out.println("\n" + valor1+ "\n" + valor2 + "\n" + valor3 );
    }
    else if ((valor3 > valor1) && (valor3 > valor2) && (valor1 > valor2)) {
        System.out.println("\n" + valor2+ "\n" + valor1 + "\n" + valor3 );
    }
    entrada.close();
	}
    
}
