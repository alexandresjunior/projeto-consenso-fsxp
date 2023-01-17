package exercicios_java_experience;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("Insira o 1° valor:");
        int x = scanner.nextInt();
        System.out.println("Insira o 2° valor:");
		int y = scanner.nextInt();
		scanner.close();
		int cont = 1;
		for (int i = 1; i <= y; i++) {
			System.out.print(i);
			if (i % x == 0) System.out.println("");
			else System.out.print(" ");

		}

	}

}
