package javaExercicios;
import java.util.Scanner;

public class Exercicio37 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        while (sc.hasNext()) {
	            String player1 = sc.next();
	            String choice1 = sc.next();
	            int number1 = sc.nextInt();
	            String player2 = sc.next();
	            String choice2 = sc.next();
	            int number2 = sc.nextInt();
	            boolean player1Wins;
	            if (choice1.equals("PAR")) {
	                player1Wins = (number1 + number2) % 2 == 0;
	            } else {
	                player1Wins = (number1 + number2) % 2 != 0;
	            }
	            System.out.println(player1Wins ? player1.toUpperCase() : player2.toUpperCase());
	        }
	    }
	}
