package exercicios_java_experience;

import java.util.Scanner;

public class Exercicio39 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira um valor:");
		int valor = scanner.nextInt();
		scanner.close();
		
		for (int i = 0;i <= 10; i++) {
			System.out.println(valor + " x "+ i + " => "+(valor*i));
		}

	}

}
