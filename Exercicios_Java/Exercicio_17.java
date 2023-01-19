package Exercicios_java;

import java.util.Scanner;

public class Exercicio_17 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Quantidade de testes: ");
		int N = teclado.nextInt();
		int x = 0;
		int cont = 0;

		for (int i = 0; i < N; i++) {
			cont = 0;
			System.out.println("Digite os valores: ");
			x = teclado.nextInt();
			
			teclado.close();
			
			for (int j = 2; j < x; j++) {
				if (x % j == 0)
					cont++;
			}
			if (cont == 0)
				System.out.println(x + " é primo");
			else
				System.out.println(x + " nao é primo");
		}
	}
}	

	
	


