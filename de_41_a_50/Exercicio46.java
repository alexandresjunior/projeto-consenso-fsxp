package de_41_a_50;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio46 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		int n1 = sc.nextInt();
		System.out.print("- ");
		int n2 = sc.nextInt();
		int f1 = n1;
		int f2 = n2;
		if(n1 >= 2) {
			for(int i = n1 -1; i >=1; i--) {
				f1 *= i;
			}
		}else {
			f1 = 1;
		}
		
		if(n2 >= 2) {
			for(int i = n2 -1; i >=1; i--) {
				f2 *= i;
			}
		}else {
			f2 = 1;
		}
		
		System.out.println((f1 + f2));
		sc.close();
	}

}
