package Exercicios_java;

import java.util.Scanner;

public class Exercicio_48 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int idade = teclado.nextInt();
		float peso = teclado.nextFloat();
		double dose = 0;
		int ml = 500;

		teclado.close();

		if (idade >= 12) {
			if (peso >= 60)
				dose = 1000 / ml;
			else if (peso < 60)
				dose = 875 / ml;
		} else {
			if (peso >= 5 && peso <= 9)
				dose = 125 / ml;
			else if (peso > 9 && peso <= 16)
				dose = 250 / ml;
			else if (peso > 16 && peso <= 24)
				dose = 375 / ml;
			else if (peso > 24 && peso <= 30)
				dose = 500 / ml;
			else if (peso > 30)
				dose = 750 / ml;
		}

		int gotas = (int) dose * 20;
		System.out.println(gotas + " gotas");
	}

}

