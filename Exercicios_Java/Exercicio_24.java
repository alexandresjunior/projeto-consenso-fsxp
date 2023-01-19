package Exercicios_java;
import java.util.Scanner;


public class Exercicio_24 {public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Digite um valor de 5 digitos ");
	int valor=teclado.nextInt();
	
	teclado.close();
	
	String x=Integer.toString(valor);
	String y= new StringBuilder(x).reverse().toString();

	if (x.equals(y)) {
		System.out.println("S");
	}else {
		System.out.println("N");
	}

	
	
}

}
