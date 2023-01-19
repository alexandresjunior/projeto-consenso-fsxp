package Exercicios_java;

import java.util.Scanner;

public class Exercicio_22 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int consumo = 0;
		int valor = 0;

		System.out.println("Total de m3 consumidos: ");
		consumo = teclado.nextInt();

		teclado.close();

		if (consumo <= 10) {
			valor = 7;
		} else if (consumo >= 11 && consumo <= 30) {
			valor = 7 + (consumo - 10) * 1;
		} else if (consumo >= 31 && consumo <= 100) {
			valor = 7 + (consumo - 10 * 1) + (consumo - 30) * 2;
		} else {
			valor = 7 + (consumo - 10 * 1) + (consumo - 30) * 2 + (consumo - 100) * 3;
		}
		System.out.println(valor);

	}

}
