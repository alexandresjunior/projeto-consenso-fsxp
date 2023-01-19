package Exercicios_java;

import java.util.Scanner;

public class Exercicio_37 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int x, y;
		String j1, j2, e1, e2;

		System.out.println("Nome do 1º jogador");
		j1 = teclado.next();
		System.out.println("Escolha do 1º jogador");
		e1 = teclado.next();
		System.out.println("Número escolhido pelo 1º jogador");
		x = teclado.nextInt();
		System.out.println("Nome do 2° jogador");
		j2 = teclado.next();
		System.out.println("Escolha do 2° jogador");
		e2 = teclado.next();
		System.out.println("Número escolhido pelo 2° jogador");
		y = teclado.nextInt();
		
		teclado.close();

		if ((x + y) % 2 == 0) {
			if (e1.equals("par"))
				System.out.println(j1);
		} else {
			System.out.println(j2);
		}

		if (x + y % 2 != 0) {
			if (e1.equals("impar"))
				System.out.println(j1);
		} else {
			System.out.println(j2);
		}

	}

}


