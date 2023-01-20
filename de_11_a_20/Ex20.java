package de_11_a_20;

import java.util.Locale;
import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		/*
		 * A ELETROSHOCK S.A. é uma empresa de distribuição de energia bastante
justa (pelo menos ela se diz ser!). Ela faz cobrança proporcional com a renda da
família e do bairro. O programa deve imprimir uma mensagem de erro caso o bairro
digitado seja inválido. Além disso, caso a renda da pessoa caia fora das faixas da
tabela, não haverá desconto. Se a renda OU o consumo forem valores negativos,
deve ser emitida uma mensagem de erro.
O programa deve ler o código do bairro (S: Santa Ana; I: Industriários; T: Tabatinga),
a renda da família e o consumo em reais e obter o desconto de acordo com a tabela
abaixo:
Bairro Renda (R$) Desconto (R$)
Santa Ana [50; 500] 50
(500; 1000] 25
Industriários [240; 1000] 240
(1000; 5000] 120
Tabatinga (5000; 1000] 720
(10000; 20000] 360
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		String cid = sc.next();
		System.out.print("- ");
		double v1 = sc.nextDouble();
		System.out.print("- ");
		double v2 = sc.nextDouble();
		
		
		if(v1 < 0 || v2 < 0) {
			
			System.out.println("renda e consumo nao podem ser negativos.");
			
		} else if(cid.equalsIgnoreCase("S")) {
			
			if(v1 >= 50 && v1 <= 500) {
				v2 -= 50;
			} else if(v1 > 500 && v1 <= 1000) {
				v2 -= 25;
			}
			
			System.out.println(v2);
			
		} else if(cid.equalsIgnoreCase("I")) {
			
			if(v1 >= 240 && v1 <= 1000) {
				v2 -= 240;
			} else if(v1 > 1000 && v1 <= 5000) {
				v2 -= 120;
			}
			
			System.out.println(v2);
			
			
		} else if(cid.equalsIgnoreCase("T")) {
			if(v1 > 5000 && v1 <= 10000) {
				v2 -= 720;
			} else if(v1 > 10000 && v1 <= 20000) {
				v2 -= 360;
			}
			
			System.out.println(v2);
			
		} else {
			
			System.out.println("Valor invalido");
		}
		
		
	}

}
