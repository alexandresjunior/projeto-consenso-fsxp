package de_31_a_40;

import java.util.Locale;
import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		
		/*
		 * Um posto de combustíveis deseja determinar qual de seus produtos tem a
preferência de seus clientes. Escreva um programa para ler o tipo de combustível
abastecido (codificado da seguinte forma: 1. Álcool 2. Gasolina 3. Diesel) e a
quantidade de litros anotados em 5 abastecimentos realizados.

		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int c1 = 0, c2 = 0, c3 = 0;
		double l1 = 0, l2 = 0, l3 = 0;
		for(int i = 0; i < 5; i++) {
			System.out.print("- ");
			int c = sc.nextInt();
			System.out.print("- "); 
			double l = sc.nextDouble();
			System.out.println("-----------------------"); 
			if(c == 1) {
				c1++;
				l1 += l;
			} else if(c == 2) {
				c2++;
				l2 += l;
			} else if(c == 3) {
				c3++;
				l3 += l;
			}
		}
		System.out.println("1. Alcool: " + c1 + " - Qtd litros: " + l1);
		System.out.println("2. Gasolina: " + c2 + " - Qtd litros: " + l2);
		System.out.println("3. Diesel: " + c3 + " - Qtd litros: " + l3);
	}

}
