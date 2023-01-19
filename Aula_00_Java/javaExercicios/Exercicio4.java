package javaExercicios;
import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);

	    int a = scanner.nextInt();
	    int b = scanner.nextInt();
	    int c = scanner.nextInt();

	    // encontra o maior valor
	    int max = a;
	    if (b > max) {
	      max = b;
	    }
	    if (c > max) {
	      max = c;
	    }

	    // encontra o menor valor
	    int min = a;
	    if (b < min) {
	      min = b;
	    }
	    if (c < min) {
	      min = c;
	    }

	    System.out.println("Maior: " + max);
	    System.out.println("Menor: " + min);
	 }
}


