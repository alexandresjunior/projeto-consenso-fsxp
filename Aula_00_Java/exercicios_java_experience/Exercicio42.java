package exercicios_java_experience;

import java.util.Scanner;

public class Exercicio42 {

	public static void main(String[] args) {
		 	Scanner scanner = new Scanner(System.in);
	        double va = scanner.nextDouble();
	        double vn = scanner.nextDouble();
	        scanner.close();

	        double diferenca = vn - va;
	        double p = (diferenca / va) * 100;
	        System.out.printf("%.2f%%\n  ", p);

	}

}
