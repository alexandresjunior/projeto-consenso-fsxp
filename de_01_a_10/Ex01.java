package de_01_a_10;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		/*
		 * Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2
			notas de um aluno. Calcule a média ponderada do aluno, sabendo que a nota A tem
			peso 3.5 e a nota B tem peso 7.5. A soma dos pesos é 11. Assuma que cada nota
			pode ir de O até 10.0, sempre com uma casa.

		 * */
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		double n1 = sc.nextDouble();
		System.out.print("- ");
		double n2 = sc.nextDouble();
		
		System.out.println("MEDIA = " + (n1*3.5 + n2*7.5)/11);
	}
}
