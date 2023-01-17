package exercicios_java_experience;

import java.util.Scanner;

public class Exericio9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o tempo de duracao do evento em segundos :");
		int tempoEmSegundos = scanner.nextInt();
		int horas = tempoEmSegundos /3600;
		int minutos =(tempoEmSegundos%3600)/60;
		int segundos =(tempoEmSegundos%3600)%60;
		System.out.println(horas + "h " + minutos + "m " + segundos + "s");
		
		
	}

}
