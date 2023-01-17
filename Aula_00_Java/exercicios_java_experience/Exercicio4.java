package exercicios_java_experience;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int num1 = scanner.nextInt();
		System.out.println("Digite um valor:");
		int num2 = scanner.nextInt();
		System.out.println("Digite um valor:");
		int num3 = scanner.nextInt();
		
		int maior = num1;
		int menor = num1;
		
		if (maior < num2) {
			maior = num2;
		}
		if (maior < num3) {
			maior = num3;
		}
		if (menor > num2) {
			menor = num2;
			
		}
		if(menor > num3) {
			menor = num3;
		}
		System.out.println("MAIOR :"+maior);
		System.out.println("MENOR :"+menor);

	}

}
