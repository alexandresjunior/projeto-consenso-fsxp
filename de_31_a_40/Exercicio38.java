package de_31_a_40;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio38 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		int n = sc.nextInt();
		boolean primo = true;
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				primo = false;
			}
		}
		if(primo) {
			System.out.println("É primo");
		}else {
			System.out.println("Nao é primo");
		}
		sc.close();
	}

}
