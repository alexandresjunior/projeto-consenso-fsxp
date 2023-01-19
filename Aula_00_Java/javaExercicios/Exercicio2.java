package javaExercicios;
import java.util.Scanner;

public class Exercicio2 {
	
	  public static void main(String[] args) {
		  
		    Scanner input = new Scanner(System.in);

		    int numeroFuncionario = input.nextInt();
		    int horasTrabalhadas = input.nextInt();
		    double valorHora = input.nextDouble();

		    // calcula o salário
		    double salario = horasTrabalhadas * valorHora;

		    // imprime o resultado com duas casas decimais
		    System.out.printf("NUMBER = %d\n", numeroFuncionario);
		    System.out.printf("SALARY = U$ %.2f\n", salario);
		  }
		}


