package Exercicios_java;
import java.util.Scanner;

public class Exercicio_43 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		boolean possivel = false;

		System.out.println("Valor da compra");
		int N = teclado.nextInt();

		System.out.println("Valor pago: ");
		int M = teclado.nextInt();

		int troco = M - N;
		int[] notas = { 2, 5, 10, 20, 50, 100 };

	
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (troco - notas[j] == notas[i])
					possivel = true;
			}
		}

		if (possivel)
			System.out.println("POSSÍVEL");
		else
			System.out.println("IMPOSSÍVEL");

		teclado.close();
	}

}

