package de_41_a_50;

import java.util.Locale;
import java.util.Scanner;

public class Ex49 {

	public static void main(String[] args) {
		/*
		 * onstrua um programa para determinar se o indivíduo está com um peso
favorável ou não. Essa situação é determinada através do IMC (Índice de Massa
Corpórea), que é definida como sendo a relação entre o peso (PESO) e o quadrado
da Altura (ALTURA) do indivíduo. Ou seja, IMC = PESO / (ALTURA*ALTURA) e, a
situação do peso é determinada pela tabela abaixo:
CONDIÇÃO SITUAÇÃO
IMC abaixo de 20 	Abaixo do peso
IMC de 20 até 25 	Peso Normal
IMC de 25 até 30 	Sobrepeso
IMC de 30 até 40 	Obeso
IMC acima de 40 	Obeso Mórbido
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		double peso = sc.nextDouble();
		System.out.print("- ");
		double altura = sc.nextDouble();
		
		double imc = peso / (altura*altura);
		String sit = "";
		if(imc < 20) {
			sit = "abaixo do peso";
		} else if(imc >= 20  && imc <= 25) {
			sit = "peso normal";
		} else if(imc > 25 && imc <= 30) {
			sit = "sobrepeso";
		} else if(imc > 30 && imc <= 40) {
			sit = "obeso";
		} else if(imc > 40) {
			sit = "obeso morbido";
		}
		
		System.out.println("IMC = " + imc + " - " + sit);
	}

}
