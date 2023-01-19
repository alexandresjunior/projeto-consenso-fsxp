package javaExercicios;
import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		
		
		 Scanner scanner = new Scanner(System.in);

	        double nota1 = scanner.nextDouble();
	        if (nota1 < 0 || nota1 > 10) {
	            System.out.println("NOTA INVÁLIDA");
	            return;
	        }

	        double nota2 = scanner.nextDouble();
	        if (nota2 < 0 || nota2 > 10) {
	            System.out.println("NOTA INVÁLIDA");
	            return;
	        }

	        double media = (nota1 + nota2) / 2;
	        System.out.printf("MÉDIA = %.2f\n", media);
	    }
	}
