package de_01_a_10;

import java.util.Locale;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		/*
		 * Elabore um programa que permita calcular o Imposto de Renda (IR) de um casal
a partir das rendas do Homem (RH) e da Mulher (RM). O imposto é calculado sobre
a renda conjunta (RC=RH+RM) de acordo com a tabela abaixo:
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		double r1 = sc.nextDouble();
		System.out.print("- ");
		double r2 = sc.nextDouble();
		
		double rendacon = r1 + r2;
		
		String aliq;
		double imposto;
		double rendaliq;
		
		if(rendacon <= 900) {
			aliq = "Insento";
			imposto = 0;
			rendaliq = rendacon;
		} else if(rendacon <= 1500){
			aliq = "10%";
			imposto = rendacon*0.10;
			rendaliq = rendacon*0.9;
		} else if(rendacon <= 2500) {
			aliq = "15%";
			imposto = rendacon *0.15;
			rendaliq = rendacon*0.85;
		} else {
			aliq = "25%";
			imposto = rendacon*0.25;
			rendaliq = rendacon*0.75;
		}
		
		System.out.printf("Renda conjunta = R$ %.2f\n", rendacon);
		System.out.println("Aliquota utilizada = " + aliq);
		System.out.printf("Imposto de renda = R$ %.2f\n", imposto);
		System.out.printf("Renda liquida = R$ %.2f\n", rendaliq);
	}

}
