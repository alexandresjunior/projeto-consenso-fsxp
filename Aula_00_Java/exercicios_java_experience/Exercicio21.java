package exercicios_java_experience;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Informe o ano do carro 1: ");
	        int ano1 = scanner.nextInt();
	        System.out.print("Informe a velocidade do carro 1: ");
	        int velocidade1 = scanner.nextInt();

	       
	        System.out.print("Informe o ano do carro 2: ");
	        int ano2 = scanner.nextInt();
	        System.out.print("Informe a velocidade do carro 2: ");
	        int velocidade2 = scanner.nextInt();

	       
	        System.out.print("Informe o ano do carro 3: ");
	        int ano3 = scanner.nextInt();
	        System.out.print("Informe a velocidade do carro 3: ");
	        int velocidade3 = scanner.nextInt();
	        scanner.close();

	       
	        int anoMaisNovo = ano1;
	        if (ano2 > anoMaisNovo) {
	            anoMaisNovo = ano2;
	        }
	        if (ano3 > anoMaisNovo) {
	            anoMaisNovo = ano3;
	        }

	    
	        int velocidadeMaisRapida = velocidade1;
	        if (velocidade2 > velocidadeMaisRapida) {
	            velocidadeMaisRapida = velocidade2;
	        }
	        if (velocidade3 > velocidadeMaisRapida) {
	            velocidadeMaisRapida = velocidade3;
	        }

	        
	        System.out.println("Ano do carro mais novo: " + anoMaisNovo);
	        System.out.println("Velocidade do carro mais rápido: " + velocidadeMaisRapida);

	}

}
