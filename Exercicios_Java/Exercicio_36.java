package Exercicios_java;

import java.util.Scanner;

public class Exercicio_36 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		int num = teclado.nextInt();

		if (num >= 0 && num <= 10) {
			for (int i = 1; i < num; i++) {
				System.out.print("Ho" + " ");
			}
			System.out.println("Ho" + "!");
		}
		teclado.close();
	}
}
