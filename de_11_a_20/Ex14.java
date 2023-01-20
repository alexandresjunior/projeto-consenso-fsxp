package de_11_a_20;

import java.util.Locale;
import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		
		/*
		 * Leia um valor inteiro X. Em seguida apresento os 6 valores ímpares
consecutivos a partir do X, um valor por linha, Inclusive o X se for o caso.

		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		int n = sc.nextInt();
		
		for(int i = 0; i < 6;) {
			if(!(n % 2 == 0)) {
				System.out.println(n);
				i++;
			}
			n++;
		}
	}
}
