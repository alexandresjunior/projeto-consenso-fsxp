package exercicios_java_experience;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("Insira o número:");
        int n = scanner.nextInt();
        scanner.close();
		int cont = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(cont + " ");
				cont++;
			}
			System.out.println("PUM!");
			cont++;
		}

	}

}
