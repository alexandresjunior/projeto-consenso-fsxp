package de_11_a_20;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		int start = sc.nextInt();
		System.out.print("- ");
		int end = sc.nextInt();
		int tempo;
		if(end > start) {
			tempo = end - start;
		}else {
			tempo = 24 - start + end;
		}
		
		System.out.println("O jogo durou " + tempo + " hora(s)");
		sc.close();
	}
}
