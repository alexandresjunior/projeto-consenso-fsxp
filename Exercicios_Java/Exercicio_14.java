package Exercicios_java;
import java.util.Scanner;

public class Exercicio_14 {public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int valor = 0;
		int cont = 0;

		System.out.println("Digite o valor: ");
		valor = teclado.nextInt();
		
		teclado.close();

		while (cont < 6) {
			if (valor % 2 == 1) {
				System.out.println(valor);
				cont++;
			}
			valor++;

		}
	}
}

