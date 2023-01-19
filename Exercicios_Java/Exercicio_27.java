package Exercicios_java;

import java.util.Scanner;

public class Exercicio_27 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int med = 0;
		int soma = 0;
		double media = 0;

		for (int c = 0; c < 4.; c++) {
			System.out.println(c + 1 + "° Medição: ");
			med = teclado.nextInt();

			teclado.close();

			if (med < 110) {
				System.out.println(med + " NORMAL");
				soma += med;
			} else if (med >= 100 && med <= 125) {
				System.out.println(med + " ALTERADA");
				soma += med;
			} else {
				System.out.println(med + " MUITO ALTA");
				soma += med;
			}
		}
		media = (soma / 4);
		System.out.println("MÉDIA DAS LEITURAS " + media);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
