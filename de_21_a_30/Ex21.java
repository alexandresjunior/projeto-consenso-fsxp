package de_21_a_30;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		/*
		 * João e Maria estão querendo obter informações sobre Os carros da sua cidade.
Para isso eles pediram que você escrevesse um programa para ajudá-los. Eles vão
digitar Informações de três diferentes carros. Para cada carro serão lidos o ano e a
velocidade. O programa deve exibir, o ano do carro mais novo e a velocidade do
mais rápido.

		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int[] ano = new int[3];
		double[] vel = new double[3];
		
		
		for(int i = 0; i < 3; i++) {
			System.out.print("- ");
			ano[i] = sc.nextInt();
			System.out.print("- ");
			vel[i] = sc.nextDouble();
		}
		
		Arrays.sort(ano);
		Arrays.sort(vel);
		
		System.out.println("ano do carro mais novo = " + ano[2]);
		System.out.println("velocidade do mais rapido = " + vel[2]);
	}

}
