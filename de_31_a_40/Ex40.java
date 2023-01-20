package de_31_a_40;

import java.util.Locale;
import java.util.Scanner;

public class Ex40 {

	public static void main(String[] args) {
		
		/*
		 * Elabore um programa que receba três números inteiros representando os
tamanhos dos lados de um triângulo. Verifique se os números informados formam
um triângulo, ou seja, cada um dos lados informados tem que ser menor que a soma
dos outros dois. Em caso positivo informar qual tipo de triângulo seria formado:

		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		int l1 = sc.nextInt();
		System.out.print("- "); 
		int l2 = sc.nextInt();
		System.out.print("- "); 
		int l3  = sc.nextInt();
		int i = 0;
		if(l1 == l2) {
			i++;
		} if(l1 == l3) {
			i++;
		} if (l2 == l3) {
			i++;
		}
		
		if(i == 0) {
			System.out.println("ESCALENO");
		} else if(i == 1) {
			System.out.println("ISOSCELES");
		} else {
			System.out.println("EQUILATERO");
		}
	}

}
