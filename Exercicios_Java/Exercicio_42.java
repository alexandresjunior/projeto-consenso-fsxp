package Exercicios_java;
import java.util.Scanner;

public class Exercicio_42 {public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);

		double a, b = 0;
		double aumento = 0;

		System.out.println("Valor antigo: ");
		a = teclado.nextDouble();

		System.out.println("Novo valor: ");
		b = teclado.nextDouble();

		aumento = ((b * 100) / a) - 100;

		System.out.println(aumento + "%");

		teclado.close();

	}

}
