package javaExercicios;
import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);

	    String nome = input.nextLine();
	    double salarioFixo = input.nextDouble();
	    double vendas = input.nextDouble();

	    double comissao = vendas * 0.15;

	    double salarioFinal = salarioFixo + comissao;

	    System.out.printf("TOTAL = R$ %.2f\n", salarioFinal);
	  }
	}

