package de_01_a_10;

import java.util.Locale;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		/*
		 * Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a
em anos, meses e dias. Obs: Apenas para facilitar o cálculo, considere todo ano
com 365 dias e todo mês com 30 dias.
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		int i = sc.nextInt();
		
		int a = i / 365;
		int resto = i % 365;
		int m = resto / 30;
		int d = resto % 30;
		
		System.out.println(a + " ano(s)");
		System.out.println(m + " mes(es)");
		System.out.println(d + " dia(s)");
	}

}
