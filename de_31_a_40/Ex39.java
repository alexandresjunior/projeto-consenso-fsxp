package de_31_a_40;

import java.util.Locale;
import java.util.Scanner;

public class Ex39 {

	public static void main(String[] args) {
		
		/*
		 * Elabore um programa que permita exibir na tela a tabuada de um número inteiro
informado via teclado.

		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		int n = sc.nextInt();
		
		for(int i = 1; i < 11; i++) {
			System.out.println(n + " x " + i + " = " + n*i);
		}
	}

}
