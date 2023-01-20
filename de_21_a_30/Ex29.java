package de_21_a_30;

public class Ex29 {

	public static void main(String[] args) {
		/*
		 * Você deve fazer um programa que apresente a sequência conforme o exemplo
abaixo.
I=1 J=7
I=1 J=6
I=1 J=5
I=3 J=7
I=3 J=6
I=3 J=5

		 * */
		int i = 1;
		int j = 7;
		
		for(int k = 0; k < 6; k++) {
			if(k == 3) {
				i = 3;
				j = 7;
			}
			
			System.out.println("I = " + i + " J = " + j);
			j--;
		}
	}

}
