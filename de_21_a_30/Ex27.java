package de_21_a_30;

import java.util.Locale;
import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		
		/*
		 * Genival tem muito medo de ter diabetes e, por isso, o médico pediu que ele
medisse sua glicose ao longo do dia para ver se ela estava controlada. Escreva um
programa que receba como entrada 4 quatro medições dos valores da taxa de
glicose de Genival, para cada valor informado informe NORMAL ou ALTERADA e ao
final calcule a glicose média observada naquele dia.
Caso esse valor seja inferior a 110, o programa deve exibir a mensagem NORMAL,
se tiver entre 110 e 125 exibir a mensagem ALTERADA, acima de 125, a mensagem
exibida deve ser MUITO ALTA.

		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		for(int i = 0; i < 4; i++) {
			System.out.print("- ");
			int n = sc.nextInt();
			if(n < 110){
				System.out.println(n + " NORMAL");
			} else if(n >= 110 && n <= 125) {
				System.out.println(n + " ALTERADA");
			} else {
				System.out.println(n + " MUITO ALTA");
			}
			soma += n;
		}
		
		System.out.println("MEDIA DAS LEITURAS = " + soma/4);
	}

}
