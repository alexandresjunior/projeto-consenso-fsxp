package de_31_a_40;

import java.util.Locale;
import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		
		/*
		 * Escreva um programa que leia um valor inteiro N. Este N é a quantidade de
linhas de saída que serão apresentadas na execução do programa.

7 	1 2 3 PUM
	5 6 7 PUM
	9 10 11 PUM
		 * */
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
	}

}
