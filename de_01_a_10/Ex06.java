package de_01_a_10;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		/*
		 * O arquivo de entrada contém dois valores: um valor inteiro X representando a
distância total percorrida (em km) e um valor real Y representando o total de
combustível gasto, com um dígito após o ponto decimal.
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		int km = sc.nextInt();
		System.out.print("- ");
		double litro = sc.nextDouble();
		
		System.out.println(km/litro + " km/l");
	}

}
