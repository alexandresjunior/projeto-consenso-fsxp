package de_11_a_20;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		double v = sc.nextDouble();
		
		if(v > 500) {
			v *= 1.10;
		} else if (v < 300) {
			v *= 1.07;
		} else {
			v *= 1.05;
		}
		
		System.out.printf("%.2f", v);
		sc.close();
	}

}
