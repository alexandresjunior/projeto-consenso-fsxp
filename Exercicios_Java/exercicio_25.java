package Exercicios_java;

import java.util.Scanner;

public class exercicio_25 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int contador = 0;

		System.out.println("Digite os valores: ");
		int valor = teclado.nextInt();
		
		teclado.close();

		String x = Integer.toString(valor);
		char[] y = x.toCharArray();

		if (y[0] == '1') {
			contador++;
		}
		if (y[1] == '1') {
			contador++;
		}
		if (y[2] == '1') {
			contador++;
		}
		if (y[3] == '1') {
			contador++;
		}
		if (y[4] == '1') {
			contador++;
		}

		if (contador == 4) {
			System.out.println("Avaliado");
		} else {
			System.out.println("ZERO(0)");
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	



