package de_21_a_30;

public class Ex28 {

	public static void main(String[] args) {
		
		/*
		 * Você deve fazer um programa que apresente a sequência conforme o exemplo
abaixo

I=1 J=60
I=4 J=55
I=7 J=50
…
I=? J=0

		 * */
		int i = 1;
		int j = 60;
		
		while(j >= 0) {
			System.out.println("I = " + i + " J = " + j);
			i += 3;
			j -= 5;
		}
	}

}
