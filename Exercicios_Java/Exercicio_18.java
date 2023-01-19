package Exercicios_java;
import java.util.Scanner;

public class Exercicio_18 {public static void main(String[] args) {
	
	 Scanner teclado = new Scanner(System.in);
		int numero;
		int numeroInvertido = 0;
		
		System.out.println("Informe o número desejado: ");
		numero = teclado.nextInt();
		
		teclado.close();
		
		while (numero > 0) {
			numeroInvertido = numeroInvertido * 10;
			numeroInvertido = numeroInvertido + (numero % 10);
			numero = numero / 10;
		}
		System.out.println("A inversão do número digitado é: " + numeroInvertido);
	}

}
