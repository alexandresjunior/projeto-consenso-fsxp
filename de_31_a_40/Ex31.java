package de_31_a_40;

import java.util.Locale;
import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia as notas referentes às duas avaliações de um aluno.
Calcule e imprima a média semestral. Faça com que o programa só aceita notas
válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser
validada separadamente.
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		double n1 = sc.nextDouble();
		while(n1 < 0 || n1 > 10){
			System.out.print("NOTA INVALIDA\n- ");
			n1 = sc.nextDouble();
		}
		System.out.print("- "); 
		double n2 = sc.nextDouble();
		while(n2 < 0 || n2 > 10){
			System.out.print("NOTA INVALIDA\n- ");
			n2 = sc.nextDouble();
		}
		
		System.out.println("MEDIA = " + (n1 + n2)/2);
	}

}
