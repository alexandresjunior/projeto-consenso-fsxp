package de_11_a_20;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		
		/*
		 * A sequência de números 0 1 1 2 3 5 6 8 13 21 ... é conhecida como série de
Fibonacci. Nesta sequência, cada número, depois dos 2 primeiros, é igual à soma
dos 2 anteriores. Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N
primeiros números dessa série.

		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		int n = sc.nextInt();
		int i = 0;
		int j = 1;
		int k = i + j;
		
		if(n < 2) {
			System.out.println(i);
		} else if(n == 2) {
			System.out.print(i + " " + j);
		} else {
			System.out.print(i + " " + j + " ");
			for(int x = 2; x < n; x++) {
				System.out.print(k + " ");
				i = j;
				j= k;
				k = i + j;
			}
		}
		sc.close();
	}
}
