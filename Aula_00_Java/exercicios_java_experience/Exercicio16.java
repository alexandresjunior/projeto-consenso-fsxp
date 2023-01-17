package exercicios_java_experience;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    System.out.print("Insira a população do país A: ");
	    double a = scanner.nextDouble();

	    System.out.print("Insira a população do país B: ");
	    double b = scanner.nextDouble();

	    int anos = 0;
	    while (a < b) {
	    	a += a * 0.03;
	    	b += b * 0.015;
	      anos++;
	    }

	    System.out.println("anos + ");


		

	}

}
