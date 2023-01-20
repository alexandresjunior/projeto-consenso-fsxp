package de_21_a_30;

import java.util.Locale;
import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		
		/*
		 *  Um número é palíndromo se ele pode ser lido de trás para frente e ainda assim
obtermos o mesmo valor. Por exemplo: 10301 é palíndromo, já 12342 não é. Então,
dado um número de 5 algarismos, você deve determinar se ele é palíndromo.

		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		Integer n = sc.nextInt();
		String str = n.toString();
		
		String reverse = "";
		
		int j = 0;
		for(int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		int x = Integer.valueOf(reverse);
		
		if(x == n) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}
	}

}
