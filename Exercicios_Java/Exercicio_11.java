package Exercicios_java;
import java.util.Scanner;

public class Exercicio_11 {public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	
	int inicio=0;
	int fim=0;
	int duracao=0;
	
	System.out.println("Horário de início do jogo: ");
	inicio=teclado.nextInt();
	System.out.println("Horário do fim do jogo: ");
	fim=teclado.nextInt();
	
	teclado.close();
	
	if (inicio>fim) {
		duracao=24-(inicio-fim);
	}else if (inicio<fim) {
		duracao=(fim-inicio);
	}else {
		duracao=24;
	}
	
	System.out.println("O JOGO DUROU "+duracao+" HORAS");
	
	
	}
	
	
	}
	
	
	
	
	
	
	
	
	



