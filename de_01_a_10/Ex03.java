package de_01_a_10;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa que lê o nome de um vendedor, o seu salário fixo e o total de
vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha
15% de comissão sobre suas vendas efetuadas, informar o total a receber no final
do mês, com duas casas decimais.

		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		String nome = sc.nextLine();
		System.out.print("- ");
		double sal = sc.nextDouble();
		System.out.print("- ");
		double venda = sc.nextDouble();
		
		System.out.printf("TOTAL = R$ %.2f", (sal + venda*0.15));
	}

}
