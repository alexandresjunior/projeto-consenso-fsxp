package de_01_a_10;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		int km = sc.nextInt();
		System.out.print("- ");
		double litro = sc.nextDouble();
		
		System.out.println(km/litro + " km/l");
		sc.close();
	}

}
