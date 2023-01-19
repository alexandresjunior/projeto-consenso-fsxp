package javaExercicios;
import java.util.Scanner;

public class Exercicio9 {
	
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int seconds = scanner.nextInt();

	    // calcula o número de horas, minutos e segundos
	    int hours = seconds / 3600;
	    seconds %= 3600;
	    int minutes = seconds / 60;
	    seconds %= 60;

	    
	    System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
	 }
}


