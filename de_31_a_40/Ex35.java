package de_31_a_40;

public class Ex35 {

	public static void main(String[] args) {
		
		/*
		 *  Escreva um programa para calcular e escrever o valor de S, sendo S dado pela
fórmula: S = 1 + 3/2 + 5/4 + 7/8 +... + 39/?

		 * */
		double s = 0;
		int i = 1;
		int j = 1;
		System.out.print("S = ");
		while(i <= 39) {
			s += i / j;
			System.out.println(i+"/"+j);
			i += 2;
			j *= 2;
		}
		System.out.println();
		System.out.println("= "+ s);
	}

}
