package exercicios_java_experience;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double novoSalario;
		double salario;
		
		System.out.println("Digite o salario :");
		salario = scanner.nextDouble();
		scanner.close();
		
	    
	    if (salario > 500) {
	      novoSalario = salario * 1.1;
	      System.out.println("O novo salário do funcionário é: " + novoSalario);
	    } else if (salario > 300) {
	      novoSalario = salario * 1.07;
	      System.out.println("O novo salário do funcionário é: " + novoSalario);
	    } else {
	      novoSalario = salario * 1.05;
	      System.out.println("O novo salário do funcionário é: " + novoSalario);
	    }

	}

}
