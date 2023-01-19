package Exercicios_java;

import java.util.Scanner;

public class Exercicio_26 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double altura = 0;
		int idade = 0;
		int contador = 0;

		System.out.println("Altura: ");
		altura = teclado.nextDouble();

		System.out.println("Idade: ");
		idade = teclado.nextInt();

		teclado.close();

		if (altura >= 1.5 && idade >= 12) {
			contador++;
		}
		if (altura >= 1.4 && idade >= 14) {
			contador++;
		}
		if (altura > 1.7 || idade > 16) {
			contador++;
		}

		System.out.println(contador);

	}

}
