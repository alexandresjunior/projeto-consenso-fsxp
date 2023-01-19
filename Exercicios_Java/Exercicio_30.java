package Exercicios_java;

import java.util.Scanner;

public class Exercicio_30 {
	public static void main(String[] args) {

		int X, Y;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite os valores: ");
		while (((X = teclado.nextInt()) > 0) && ((Y = teclado.nextInt()) > 0)) {
			int soma = 0;
			if (X > Y) {
				for (Y = Y; Y <= X; Y++) {
					soma += Y;
					System.out.print(Y + " ");
				}
				System.out.println("Soma=" + soma);
			} else {
				for (X = X; X <= Y; X++) {
					soma += X;
					System.out.print(X + " ");
				}
				System.out.println("Soma=" + soma);
			}
		}
teclado.close();
	}



	
	
	
	
	
	
	
	
	
}

