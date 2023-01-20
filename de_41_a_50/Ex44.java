package de_41_a_50;

import java.util.Locale;
import java.util.Scanner;

public class Ex44 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa que leia cinco números com dupla precisão(double)
diferentes entre si e imprima: a Média dos ímpares, o Maior número par e a
Diferença entre o maior e o menor número informado.

		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int impar = 0;
		int somaimp = 0;
		int maior = 0;
		int menor = 0;
		int maiorpar = 0;
		
		System.out.print("- ");
		int n = sc.nextInt();
		maior = n;
		menor = n;
		if(n % 2 == 0) {
			maiorpar = n;
		}else {
			somaimp += n;
			impar++;
		}
		
		
		for(int i = 0; i < 4; i++) {
			
			System.out.print("- ");
			n = sc.nextInt();
			if(n % 2 == 0) {
				if(n > maiorpar) {
					maiorpar = n;
				}
				
			}else {
				somaimp += n;
				impar++;
			}
			
			if(n > maior) {
				maior = n;
			}
			if(n < menor) {
				menor = n;
			}
			
		}
		
		System.out.println("Media dos numeros impares: " + (somaimp/impar));
		System.out.println("Maior numero PAR: " + maiorpar);
		System.out.println("Diferença = " + (maior - menor));
	}

}
