package exercicios_java_experience;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a quantidade de dias :");
		int idadeEmDias = scanner.nextInt();
		scanner.close();
		
		int ano = idadeEmDias /365;
		
		int mes = (idadeEmDias%365)/30;
		
		int dias = (idadeEmDias%365)%30;
		
		System.out.println(ano + " anos, " + mes + " meses, " + dias + " dias");
	}

}
