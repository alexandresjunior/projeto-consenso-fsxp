package Exercicios_java;

import java.util.Scanner;

public class Exercicio_46 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Primeiro valor: ");
		int M = teclado.nextInt();
		System.out.println("Segundo valor: ");
		int N = teclado.nextInt();
		
		teclado.close();
		
		long fatorial = fatorial(M) + fatorial(N);
		System.out.println(fatorial);
	}

	public static long fatorial(int j) {
		long fatorial = 1;
		for (int i = 2; i <= j; i++)
			fatorial *= i;
		return fatorial;
	}

}
