package exercicios_java_experience;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		double salario,totalVendas,comissao,total;
		
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Digite o seu nome :");
		String nome = scanner.nextLine();
		System.out.println("Digite seu salario:");
		salario = scanner.nextDouble();
		System.out.println("Digite quanto em R$ fez em vendas :");
		totalVendas = scanner.nextDouble();
		comissao = totalVendas*0.15;
		total = comissao +salario;
		System.out.printf("Total R$ %.2f %n",total);
		
		
		
		
		
		

}}
