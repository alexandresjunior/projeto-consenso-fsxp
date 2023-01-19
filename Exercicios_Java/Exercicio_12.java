package Exercicios_java;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio_12 {public static void main(String[] args) throws IOException {
	
	
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Primeira palavra: ");
			String palavra1 = teclado.next();
			
			System.out.println("Segunda palavra: ");
			String palavra2 = teclado.next();
			
			System.out.println("Terceira palavra: ");
			String palavra3 = teclado.next();
			
			teclado.close();
			
			if (palavra1.equalsIgnoreCase("vertebrado")) {
				if (palavra2.equalsIgnoreCase("ave")) {
					if (palavra3.equalsIgnoreCase("carnivoro")) {
						System.out.println("aguia");
					} else {
						System.out.println("pomba");
					}
				} else {
					if (palavra3.equalsIgnoreCase("onivoro")) {
						System.out.println("homem");
					} else {
						System.out.println("vaca");
					}
				}
			} else {
				if (palavra2.equalsIgnoreCase("inseto")) {
					if (palavra3.equalsIgnoreCase("hematofago")) {
						System.out.println("pulga");
					} else {
						System.out.println("lagarta");
					}
				} else {
					if (palavra3.equalsIgnoreCase("hematofago")) {
						System.out.println("sanguessuga");
					} else {
						System.out.println("minhoca");
					}			
				}
			}
		}
		
	
	
	
	
}


