package de_21_a_30;

import java.util.Locale;
import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		
		/*
		 * Toda apresentação de trabalho tem seus requisitos mínimos, que precisam ser
atendidos, caso contrário, o trabalho não é aceito e o aluno fica com nota 0. A
apresentação de Programação 1 está chegando, e o Professor José deixou claro
que se os trabalhos não passassem por todos os requisitos mínimos, ele não iria
julgar o trabalho.
Eis os requisitos:
● Requisito 1: Interface gráfica ou Inteligência Artificial.
● Requisito 2: Encapsulamento e Indentação.
● Requisito 3: Uso de Structs
Dada a entrada, descubra se o aluno ficou com 0 ou o seu trabalho será avaliado
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- ");
		Integer n = sc.nextInt();
		String str = n.toString();
		
		if(str.charAt(0) == '0' && str.charAt(1) == '0') {
			System.out.println("0 (ZERO)");
		} else if( str.charAt(2) == '0' || str.charAt(3) == '0'|| str.charAt(4) == '0') {
			System.out.println("0 (ZERO)");
		} else {
			System.out.println("AVALIADO");
		}
	}

}
