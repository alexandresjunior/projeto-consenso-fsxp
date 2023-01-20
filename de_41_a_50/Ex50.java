package de_41_a_50;

import java.util.Locale;
import java.util.Scanner;

public class Ex50 {

	public static void main(String[] args) {
		/*
		 * A China está construindo um elevador espacial, que permitirá o lançamento de
sondas e satélites a um custo muito mais baixo, viabilizando não só projetos de
pesquisa científica como o turismo espacial. No entanto, os chineses são muito
supersticiosos, e por isso têm um cuidado muito especial com a numeração dos
andares do elevador: eles não usam nenhum número que contenha o dígito “4” ou a
sequência de dígitos "13". Assim, eles não usam o andar 4, nem o andar 13, nem o
andar 134, nem o andar 113, mas usam o andar 103. Assim, os primeiros andares
são numerados 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 15, 16, … Como o elevador espacial
tem muitos andares, e eles precisam enumerar todos os andares do elevador, os
chineses pediram que você escrevesse um programa que, dado o andar, indica o
número que deve ser atribuído a ele.
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- ");
		
		int n = sc.nextInt();
		
		Integer x = 0;
		for(int i = 0; i < n; i++) {
			x++;
			while(x.toString().contains("13")) {
				x++;
			}
			while(x.toString().contains("4")) {
				x++;
			}
			
			
		}
		System.out.println(x);
	}

}
