package de_41_a_50;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio49 {

	public static void main(String[] args) {
		
		 
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
		sc.close();
	}

}
