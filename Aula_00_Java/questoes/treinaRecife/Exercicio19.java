package treinaRecife;

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		System.out.print("digite o salario atual");
		Scanner input = new Scanner(System.in);
		double salarioAtual = input.nextDouble();
		double novoSalario =0;
		input.close();
		if (salarioAtual > 500) {
			novoSalario = salarioAtual + (salarioAtual * 0.1);
			
		}else if (salarioAtual > 300) {
			novoSalario = salarioAtual + (salarioAtual * 0.07);
			
		}else {
			novoSalario = salarioAtual + (salarioAtual * 0.05);
		}
		System.out.printf("%.2f", novoSalario);
	}

	
}
