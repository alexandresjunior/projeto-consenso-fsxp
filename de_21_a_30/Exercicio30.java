package de_21_a_30;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			
			
			System.out.print("- ");
			int par1 = sc.nextInt();
			System.out.print("- ");
			int par2 = sc.nextInt();
			if(par1 > par2) {
				int soma = 0;
				while(par1 >=par2) {
					soma += par2;
					System.out.print(par2 + " ");
					par2++;
				}
				System.out.println("soma = " + soma);
			}else {
				int soma = 0;
				while(par2 >= par1) {
					System.out.print(par1 + " ");
					soma += par1;
					par1++;
				}
				System.out.println("soma = " + soma);
			}
			
			
			System.out.println("--------------");
		}
		sc.close();
		
		
	}

}
