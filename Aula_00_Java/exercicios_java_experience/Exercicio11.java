package exercicios_java_experience;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("digite a hora de inicio :");
		int horaInicio = scanner.nextInt();
		System.out.println("digite a hora de final :");
		int horaFinal = scanner.nextInt();
		
		int tempoDeDuracao;
		if (horaInicio > horaFinal) {
			horaFinal += 24;
			
		}
		else if (horaInicio == horaFinal) {
			tempoDeDuracao = 24;
			System.out.println("O JOGO DUROU :" + tempoDeDuracao +" HORAs");;
			return;
		}
		tempoDeDuracao = horaFinal-horaInicio;
		
		System.out.println("O JOGO DUROU :" + tempoDeDuracao +" HORAs");

	}

}
