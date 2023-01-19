package javaExercicios;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int start = sc.nextInt();
	        int end = sc.nextInt();

	        int duration = end - start;
	        if (duration < 0) {
	            duration += 24;
	        }

	        System.out.println("O JOGO DUROU " + duration + " HORA(S)");

	        sc.close();
	}

}
