package Exercicios_java;

import java.util.Scanner;

public class Exercicio_19 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double salario = 0;

		System.out.println("Valor do salário: ");
		salario = teclado.nextDouble();
		
		teclado.close();

		if (salario >= 500) {
			salario = salario + (salario * 10) / 100;
		} else if (salario >= 300 && salario < 500) {
			salario = salario + (salario * 7) / 100;
		} else {
			salario = salario + (salario * 5) / 100;
		}

		System.out.println("O novo salário é R$" + salario);

	}

}
