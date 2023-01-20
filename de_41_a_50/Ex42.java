package de_41_a_50;

import java.util.Locale;
import java.util.Scanner;

public class Ex42 {

	public static void main(String[] args) {
		
		/*
		 * Vovó Rosa e seus colegas de turma foram ao cinema assistir a um filme, mas
ficaram estarrecidos com o aumento do preço do ingresso. Revoltados, eles
decidiram fazer uma manifestação contra o sistema capitalista opressor, agendada
para amanhã na Praça José de Alencar. Vovó Rosa quer colaborar com o
movimento fazendo um cartaz com a seguinte palavra de ordem:
QUE ABSURDO! O PREÇO DO CINEMA SUBIU ... % !!!

Mas ela não é muito boa em Matemática, e está solicitando sua ajuda para calcular
a porcentagem de que precisa para completar o cartaz.
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		double p1 = sc.nextDouble();
		System.out.print("- ");
		double p2 = sc.nextDouble();
		
		double aumento = p2 - p1;
		
		System.out.println((aumento/p1)*100 + "%");
	}

}
