package de_01_a_10;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		int i = sc.nextInt();
		
		int h = i / 3600;
		int resto = i % 3600;
		int m = resto / 60;
		int s = resto % 60;
		
		System.out.printf("HH:MM:SS = %02d:%02d:%02d", h, m, s);
		sc.close();
		
	}

}
