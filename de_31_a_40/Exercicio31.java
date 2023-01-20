package de_31_a_40;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		double n1 = sc.nextDouble();
		while(n1 < 0 || n1 > 10){
			System.out.print("NOTA INVALIDA\n- ");
			n1 = sc.nextDouble();
		}
		System.out.print("- "); 
		double n2 = sc.nextDouble();
		while(n2 < 0 || n2 > 10){
			System.out.print("NOTA INVALIDA\n- ");
			n2 = sc.nextDouble();
		}
		
		System.out.println("MEDIA = " + (n1 + n2)/2);
		sc.close();
	}

}
