package Exercicios_java;

import java.util.Scanner;

public class Exercicio_23 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int n1, n2 = 0;

		System.out.println("Digite o primeiro valor: ");
		n1 = teclado.nextInt();

		System.out.println("Digite o segundo valor: ");
		n2 = teclado.nextInt();
		
		teclado.close();

		if (n1 > n2) {
			System.out.println("1");
		} else {
			System.out.println("0");

		}

		if (n1 == n2) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

		if (n1 < n2) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

		if (n1 != n2) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

		if (n1 >= n2) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

		if (n1 <= n2) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

}
