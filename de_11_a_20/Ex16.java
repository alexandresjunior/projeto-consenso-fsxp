package de_11_a_20;

import java.util.Locale;
import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		/*
		 * Supondo que a população de um país A seja recebido via teclado em uma
variável com dupla precisão (double) representando a população atual daquele país
que possui uma taxa anual de crescimento de 3% a.a. o que a população de um
país B seja recebida também em uma variável com dupla precisão e que tenha uma
taxa anual de crescimento de 1,5% a.a., fazer um programa que calcule e de anos
necessários para que a população do país A ultrapasse ou iguale a população do
número do país B, mantida essas taxas de crescimento
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("A - "); 
		int a = sc.nextInt();
		System.out.print("B - ");
		int b = sc.nextInt();
		int i = 0;
		if(a < b) {
			while(a < b) {
				a *= 1.03;
				b *= 1.015;
				i++;
			}
			System.out.println(i + " anos");
		} else {
			System.out.println("o valor A precisa ser menor que B");
		}
	}

}
