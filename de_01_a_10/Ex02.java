package de_01_a_10;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		/*
		 * Escreva um programa que leia o número de um funcionário, seu número de horas
trabalhadas, o valor que recebe por hora e calcule o salário desse funcionário. A
seguir, mostre o número e o salário do funcionário, com duas casas decimais.

		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		int v1 = sc.nextInt();
		System.out.print("- ");
		int v2 = sc.nextInt();
		System.out.print("- ");
		double v3 = sc.nextDouble();
		
		System.out.println("NUMERO = " + v1);
		System.out.printf("SALARIO = R$ %.2f",(v2*v3) );
	}

}
