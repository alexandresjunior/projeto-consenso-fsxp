package exercicios_java_experience;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int num;
		double numHoras,valorPorHora,salario;
		
		Scanner scanner = new Scanner(System.in);
		

	    System.out.print("digite o numero do funcionario: ");
	    num = scanner.nextInt();
	    System.out.print("digite o numero de horas trabalhadas:");
	    numHoras = scanner.nextDouble();
	    System.out.print("digite o Valor por hora:");
	    valorPorHora = scanner.nextDouble();
	    
	    salario = (valorPorHora * numHoras);
	    System.out.println("NUMERO = " + num);
	    System.out.printf("SALARIO =  %.2f %n" , salario);
	    
	    
	    
	    
	    
	}

}
