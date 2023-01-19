package javaExercicios;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    double notaA = scanner.nextDouble();
	    double notaB = scanner.nextDouble();

	    // calcula a média ponderada
	    double media = (notaA * 3.5 + notaB * 7.5) / 11;

	    // imprime o resultado com duas casas decimais
	    System.out.printf("MEDIA = %.5f\n", media);
	  }
	}

