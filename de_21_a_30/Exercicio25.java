package de_21_a_30;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- ");
		Integer n = sc.nextInt();
		String str = n.toString();
		
		if(str.charAt(0) == '0' && str.charAt(1) == '0') {
			System.out.println("0 (ZERO)");
		} else if( str.charAt(2) == '0' || str.charAt(3) == '0'|| str.charAt(4) == '0') {
			System.out.println("0 (ZERO)");
		} else {
			System.out.println("AVALIADO");
		}
		sc.close();
	}

}
