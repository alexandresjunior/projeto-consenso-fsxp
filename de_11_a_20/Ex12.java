package de_11_a_20;

import java.util.Locale;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		/*
		 * Neste problema, você deverá ler 3 palavras que definem o tipo de animal
possível segundo o esquema abaixo, da esquerda para a direita. Em seguida
conclua qual dos animais seguintes foi escolhido, através das três palavras
fornecidas.

		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- ");
		String v1 = sc.nextLine();
		System.out.print("- ");
		String v2 = sc.nextLine();
		System.out.print("- ");
		String v3 = sc.nextLine();
	
	
	if(v1.equals("vertebrado")) {
		if(v2.equals("ave")) {
			if(v3.equals("carnivoro")) {
				System.out.println("aguia");
			}else if(v3.equals("onivoro")){
				System.out.println("pomba");
			} else {
				System.out.println("valor invalido");
			}
		} else if(v2.equals("mamifero")) {	
			if(v3.equals("onivoro")) {
				System.out.println("homem");
			}else if(v3.equals("herbivoro")){
				System.out.println("vaca");
			} else {
				System.out.println("valor invalido");
			}
		}else {
			System.out.println("valor invalido");
		}
	}else if( v1.equals("invertebrado")) {
		if(v2.equals("inseto")) {
			if(v3.equals("hematofago")) {
				System.out.println("pulga");
			}else if(v3.equals("herbivoro")){
				System.out.println("lagarta");
			} else {
				System.out.println("valor invalido");
			}
		} else if(v2.equals("anelideo")) {	
			if(v3.equals("hematofago")) {
				System.out.println("sanguessuga");
			}else if(v3.equals("onivoro")){
				System.out.println("minhoca");
			} else {
				System.out.println("valor invalido");
			}
	} else {
		System.out.println("valor invalido");
	}

}
}
}
