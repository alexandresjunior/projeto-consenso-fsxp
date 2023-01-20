package de_31_a_40;

import java.util.Locale;
import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		
		/*
		 * Papai Noel está brincando com seus duendes para entretê-los durante a véspera
do Natal. A brincadeira consiste nos elfos escreverem números em pedaços de
papel e colocarem no gorro do Papai Noel. Após todos terminarem de colocar os
números, Noel sorteia um papel e aquele número representa quantos "HO" o Noel
deve falar. Seu trabalho é ajudar o Papai Noel montando um problema que mostre
todos os "HO" que ele deve falar dado o número sorteado
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		int n = sc.nextInt();
		
		for(int i = 1; i < n; i++) {
			System.out.print("HO ");
		}
		System.out.println("HO!");
	}

}
