package de_31_a_40;

import java.util.Locale;
import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		
		/*
		 * Amarelinha provavelmente é a brincadeira em que as crianças da vila mais se
divertem, porém a mesma vem causando um bom tempo de discussão e choro nas
crianças que a praticam. A causa do transtorno é para decidir quem será o próximo
a pular, mas recentemente, Quico (O gênio!) teve uma grande ideia para solucionar
o problema. Basicamente a brincadeira só poderá ser jogada de dois em dois
jogadores e para escolher o próximo jogador, Quico indicou o uso do tradicional
método par ou ímpar, onde os dois jogadores informam um número e se a soma
desses números for par o jogador que escolheu PAR ganha ou vice versa.
Entretanto a utilização desse método vem deixando o Quico louco, louco, louco... E
por esse motivo ele pediu a sua ajuda! Solicitou a você um programa que dado o
nome dos jogadores, suas respectivas escolhas PAR ou ÍMPAR e os números,
informe quem foi o vencedor
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Jogador 1: ");
		System.out.print("Nome - ");
		String n1 = sc.nextLine();
		System.out.println("par ou impar - ");
		String ip1 = sc.nextLine();
		System.out.println("numero - ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.println("--------------------");
		System.out.println("Jogador 2: ");
		System.out.print("Nome - ");
		String n2 = sc.nextLine();
		System.out.println("par ou impar - ");
		String ip2 = sc.nextLine();
		System.out.println("numero - ");
		int num2 = sc.nextInt();
		
		
		if((num1 + num2) % 2 == 0) {
			if(ip1.equalsIgnoreCase("par")) {
				System.out.println("Vencedor: " + n1);
			}
			else {
				System.out.println("Vencedor: " + n2);
			}
		} else {
			if(ip1.equalsIgnoreCase("impar")) {
				System.out.println("Vencedor: " + n1);
			}
			else {
				System.out.println("Vencedor: " + n2);
			}
		}
	}

}
