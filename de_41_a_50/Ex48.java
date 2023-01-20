package de_41_a_50;

import java.util.Locale;
import java.util.Scanner;

public class Ex48 {

	public static void main(String[] args) {
		
		/*
		 * Elabore um programa que, a partir da idade e do peso de um paciente, lidas via
teclado, calcule a dosagem de determinado medicamento e escreva a receita
Informando quantas gotas do medicamento. O paciente deve tomar por dose.
Considere que o medicamento em questão possui 500 mg por ml, o que cada ml
corresponde a 20 gotas.

Adultos ou adolescentes desde 12 anos, Inclusive, se tiverem peso igual ou
acima dos 60 quilos devem tomar 1000 mg; com peso abaixo dos 60 quilos
devem tomar 875 mg.
● Para crianças e adolescentes abaixo de 12 anos a dosagem é calculada pelo
peso corpóreo conforme a tabela a seguir:
PESO 			DOSAGEM
5 a 9 kg 		125 mg
9.1 a 16 kg 	250 mg
16.1 a 24 kg 	375 mg
24.1 a 30 kg 	500 mg
Acima de 30 kg 	750 mg
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		int idade = sc.nextInt();
		System.out.print("- ");
		double peso = sc.nextDouble();
		int mg = 0;
		
		if(idade >= 12) {
			if(peso >= 60) {
				mg = 1000;
			}else {
				mg = 875;
			}
		}else {
			if(peso >= 5 && peso <= 9) {
				mg = 125;
			} else if(peso > 9 && peso <= 16) {
				mg = 250;
			} else if(peso > 16 && peso <= 24) {
				mg = 375;
			} else if(peso > 24 && peso <= 30) {
				mg = 500;
			} else if(peso > 30){
				mg = 750;
			}
		}
		int gotas = mg / 25;
		
		System.out.println(gotas + " gotas");
	}

}
