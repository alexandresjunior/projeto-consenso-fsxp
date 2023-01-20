package de_21_a_30;

import java.util.Locale;
import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		
		/*
		 * Nos parques de diversão, alguns brinquedos têm idade e altura mínimas para
poder andar neles. O parque UNINASSAU possui 3 brinquedos que possuem essa
limitação:
Barca Viking: 1,5m de altura e 12 anos.
Elevator of Death: 1,4m de altura e 14 anos.
Final Killer: 1,7m de altura ou 16 anos. no
Dada a altura e a idade de uma pessoa, faça um programa que identifique quantos
brinquedos ele pode andar.

		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		double alt = sc.nextDouble();
		System.out.print("- ");
		int idade = sc.nextInt();
		
		int i = 0;
		
		if(alt >= 1.5 && idade >= 12) {
			i++;
		}
		if(alt >= 1.4 && idade >=14) {
			i++;
		}
		if(alt >= 1.7 || idade >= 16) {
			i++;
		}
		
		System.out.println(i);
	}

}
