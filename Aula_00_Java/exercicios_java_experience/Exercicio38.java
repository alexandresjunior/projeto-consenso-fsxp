package exercicios_java_experience;

import java.util.Scanner;

public class Exercicio38 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    int v = 0;
	    boolean nPrimo;

	    System.out.println("Insira um valor: ");
	    v = scanner.nextInt();
	    scanner.close();

	    if (v == 2) {
	        nPrimo = true;
	    } else if (v % 2 == 0) {
	        nPrimo = false;
	    } else {
	        nPrimo = true;
	        for (int i = 3; i < v; i += 2) {
	            if (v % i == 0) {
	                nPrimo = false;
	                break;
	            }
	        }
	    }

	    if (nPrimo) {
	        System.out.println("É primo :");
	    } else {
	        System.out.println("Não é primo :");
	    }

	}

}
