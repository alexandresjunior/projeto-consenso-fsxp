package de_41_a_50;

import java.util.Locale;
import java.util.Scanner;

public class Ex45 {

	public static void main(String[] args) {
		/*
		 * Elabore um programa que leia o nome e a idade de cinco pessoas e apresente:
a maior idade, nome da pessoa mais nova, média das idades.

		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int maior = 0;
		int menor = 0;
		String pessoanova = "";
		double soma = 0;
		
		System.out.print("- ");
		String nome = sc.nextLine();
		System.out.print("- ");
		int idade = sc.nextInt();
		sc.nextLine();
		maior = idade;
		menor = idade;
		pessoanova = nome;
		soma += idade;
		for(int i = 1; i < 5; i++) {
			System.out.print("- ");
			nome = sc.nextLine();
			System.out.print("- ");
			idade = sc.nextInt();
			sc.nextLine();
			soma += idade;
			if(idade > maior) {
				maior = idade;
			}
			if(idade < menor) {
				pessoanova = nome;
				menor = idade;
			}
		}
		System.out.println("maior idade = " + maior);
		System.out.println("pessoa mais nova = " + pessoanova);
		System.out.println("media das idades = " + soma/5);
	}

}
