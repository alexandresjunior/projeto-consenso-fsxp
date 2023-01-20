package de_31_a_40;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		int n = sc.nextInt();
		int x = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(x + " ");
				x++;
			}
			System.out.println("PUM");
			x++;
		}
		sc.close();
	}

}
