package exercicios_java_experience;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Insira um valor inteiro: ");
	    int valor = scanner.nextInt();
	    scanner.close();

	    int[] notas = {100, 50, 20, 10, 5, 2, 1};
	    int[] quantidadeNotas = new int[notas.length];

	    System.out.println("Valor lido: " + valor);
	    System.out.print("Notas: ");
	    for (int i = 0; i < notas.length; i++) {
	      quantidadeNotas[i] = valor / notas[i];
	      valor = valor % notas[i];
	      if (quantidadeNotas[i] > 0) {
	        System.out.print(quantidadeNotas[i] + " nota(s) de R$ " + notas[i] + ", ");
	      }
	    }

	}

}
