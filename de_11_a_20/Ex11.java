package de_11_a_20;

import java.util.Locale;
import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		
		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma
duração mínima de 1 hora e máxima de 24 horas.
		 * */
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
	}
}
