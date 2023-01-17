package exercicios_java_experience;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    System.out.print("Insira a nota A: ");
	    double A = scanner.nextDouble();

	    System.out.print("Insira a nota B: ");
	    double B = scanner.nextDouble();
	    scanner.close();

	    double pesoTotal = 11;
	    double media = (A * 3.5 + B * 7.5) / pesoTotal;

	    System.out.println("A média do aluno é: " + media);
		

	}

}
