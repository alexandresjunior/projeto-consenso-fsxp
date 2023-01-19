package Exercicios_java;

import java.util.Scanner;

public class Exercicio_15 {public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int proximo, anterior = 0, atual = 1;

		System.out.println("Digite um valor: ");
		int N = teclado.nextInt();
		
		teclado.close();

		for (int i = 1; i <= N; i++) {
			if (i == N)
				System.out.println(anterior);
			else
				System.out.print(anterior + " ");
			proximo = anterior + atual;
			anterior = atual;
			atual = proximo;
		}
	}

}


