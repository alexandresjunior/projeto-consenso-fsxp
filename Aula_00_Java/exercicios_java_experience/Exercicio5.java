package exercicios_java_experience;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeros[] = new int[3];
		
		for (int i = 0;i < numeros.length;i++) {
			System.out.println("Digite o numero :"+ (i+1));
			numeros[i]= scanner.nextInt();
		}
		Arrays.sort(numeros);
		for (int j = 0 ; j < numeros.length;j++) {
			System.out.println(numeros[j]);
		}
		
					
		
		

	}

}
