package exercicios_java_experience;

import java.util.Scanner;

public class Exercicio37 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x, y;
		String j1, j2, e1, e2;

		System.out.println("Nome do 1º jogador:");
		j1 = scanner.next();
		System.out.println("Escolha do 1º jogador:");
		e1 = scanner.next();
		System.out.println("Número do 1º jogador:");
		x = scanner.nextInt();
		System.out.println("Nome do 2° jogador:");
		j2 = scanner.next();
		System.out.println("Escolha do 2° jogador:");
		e2 = scanner.next();
		System.out.println("Número do 2° jogador:");
		y = scanner.nextInt();
		scanner.close();

		if ((x + y) % 2 == 0) {
			if (e1.equals("Par"))
				System.out.println(j1);
		} else {
			System.out.println(j2);
		}

		if (x + y % 2 != 0) {
			if (e1.equals("Ímpar"))
				System.out.println(j1);
		} else {
			System.out.println(j2);
		}

	}

}
