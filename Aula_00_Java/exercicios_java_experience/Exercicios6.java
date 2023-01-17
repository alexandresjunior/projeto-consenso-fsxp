package exercicios_java_experience;

import java.util.Scanner;

public class Exercicios6 {

	public static void main(String[] args) {
		int x;
		double y,consumoMedio;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a distancia total:");
		x = scanner.nextInt();
		System.out.println("Digite a quantidade de combustivel total:");
		y = scanner.nextDouble();
		consumoMedio = x/y;
		System.out.println("O consumo médio do automóvel é: " + consumoMedio + " km/l");
		
		
		

	}

}
