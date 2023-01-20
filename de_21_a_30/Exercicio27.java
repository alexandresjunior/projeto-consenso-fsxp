package de_21_a_30;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		for(int i = 0; i < 4; i++) {
			System.out.print("- ");
			int n = sc.nextInt();
			if(n < 110){
				System.out.println(n + " NORMAL");
			} else if(n >= 110 && n <= 125) {
				System.out.println(n + " ALTERADA");
			} else {
				System.out.println(n + " MUITO ALTA");
			}
			soma += n;
		}
		
		System.out.println("MEDIA DAS LEITURAS = " + soma/4);
		sc.close();
	}

}
