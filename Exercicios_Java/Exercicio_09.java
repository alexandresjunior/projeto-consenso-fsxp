package Exercicios_java;
import java.util.Scanner;
import java.time.Duration;


public class Exercicio_09 {public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	
	int duracao=0;
	
	System.out.println("Qual a duração do evento: ");
	duracao=teclado.nextInt();
	
	teclado.close();
	
	Duration total = Duration.ofSeconds(duracao);
	int horas = total.toHoursPart();
	int minutos = total.toMinutesPart();
	int segundos = total.toSecondsPart();
	
	System.out.println("HH:MM:SS = "+horas+":"+minutos+":"+segundos);
}

}
