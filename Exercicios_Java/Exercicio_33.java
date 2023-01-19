package Exercicios_java;

import java.util.Scanner;

public class Exercicio_33 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int N = 0;

		System.out.println("Digite o valor: ");
		N = teclado.nextInt();

		teclado.close();

		for (int i = 1; i <= (4 * N - 1); i += 4) {
			for (int j = i; j <= i + 2; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" PUM\n");
		}
	}

}
