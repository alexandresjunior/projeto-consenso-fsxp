package Exercicios_java;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio_21 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[] ano = new int[3];
		double[] velocidade = new double[3];

		for (int c = 0; c < 3; c++) {
			System.out.println("Ano do " + (c + 1) + " carro");
			ano[c] = teclado.nextInt();
			System.out.println("Velocidade do " + (c + 1) + " carro");
			velocidade[c] = teclado.nextDouble();
		}
		
		teclado.close();
		
		Arrays.sort(ano);
		Arrays.sort(velocidade);

		System.out.println("ANO DO CARRO MAIS NOVO: " + ano[2]);
		System.out.println("MAIOR VELOCIDADE: " + velocidade[2]);
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
