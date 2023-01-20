package de_11_a_20;

import java.util.Locale;
import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		/*
		 * Devido à proximidade com o Dia do Trabalho, uma empresa resolveu conceder
aumentos salariais a seus funcionários. Aqueles com salário superior a R$ 500,
terão aumento de 10%, enquanto os que ganham mais de R$ 300 terão aumento de
7%. Os demais funcionários terão aumento de apenas 5%. Escreva um programa
que receba como entrada o salário atual de um funcionário, calcule e exiba o valor
de seu novo salário já com o aumento concedido.
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		double v = sc.nextDouble();
		
		if(v > 500) {
			v *= 1.10;
		} else if (v < 300) {
			v *= 1.07;
		} else {
			v *= 1.05;
		}
		
		System.out.printf("%.2f", v);
	}

}
