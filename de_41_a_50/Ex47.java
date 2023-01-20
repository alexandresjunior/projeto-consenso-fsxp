package de_41_a_50;

public class Ex47 {
	public static void main(String[] args) {
		
		/*
		 *  Escreva os 20 primeiros termos da série: 1, 3, 9, 27, ...

		 * */
		int n = 1;
		for(int i = 0; i < 20; i++) {
			System.out.print(n + " ");
			n *= 3;
		}
	}
}
