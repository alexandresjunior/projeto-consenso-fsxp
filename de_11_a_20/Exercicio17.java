package de_11_a_20;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		/*
		 * Na matemática, um Número Primo é aquele que pode ser dividido somente por 1
(um) e por ele mesmo. Por exemplo, o número 7 é primo, pois pode ser dividido
apenas pelo número 1 e pelo número 7.

		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		int n = sc.nextInt();
		int[] array = new int[n];
		boolean primo = true;
		
		for(int j = 2; j < n;j++) {
			
			if(n % j == 0) {
				primo = false;
			} 
		}
		if(primo) {
			System.out.println(n + " é primo");
		} else {
			System.out.println(n + " nao é primo");
		}
		
	
		for(int i = 0; i < array.length; i++) {
			System.out.print("- ");
			array[i] = sc.nextInt();
			primo = true;
			for(int j = 2; j < array[i];j++) {
				if(array[i] % j == 0) {
					primo = false;
				} 
			}
			if(primo) {
				System.out.println(array[i] + " é primo");
			} else {
				System.out.println(array[i] + " nao é primo");
			}
			
		}
		sc.close();
	}

}
