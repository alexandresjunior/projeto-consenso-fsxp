package de_21_a_30;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		Integer n = sc.nextInt();
		String str = n.toString();
		
		String reverse = "";
		
		
		for(int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		int x = Integer.valueOf(reverse);
		
		if(x == n) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}
		sc.close();
	}

}
