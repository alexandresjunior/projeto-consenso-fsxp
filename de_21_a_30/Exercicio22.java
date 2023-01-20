package de_21_a_30;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		int n = sc.nextInt();
				
		double gasto = 0;
			
		
		if(n <= 10) {
			gasto = 7;
		} else if (n <= 30) {
			gasto = 7 + (n - 10);
		} else if (n <= 100) {
			gasto = 7 + (n - 20) + (n - 30)*2;
		} else {
			gasto = 7 + (n-20) + (n-30)*2 + (n-100)*3;
		}
		
		System.out.println("Valor em reais = R$ " + gasto);
		sc.close();
		
	}

}
