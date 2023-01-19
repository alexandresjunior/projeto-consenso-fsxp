package javaExercicios;
import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
	        int num = scan.nextInt();

	        int first = num / 10000;
	        int second = (num % 10000) / 1000;
	        int third = (num % 1000) / 100;
	        int forth = (num % 100) / 10;
	        int fifth = num % 10;

	        if (first == fifth && second == forth) {
	            System.out.println("S");
	        } else {
	            System.out.println("N");
	        }

	}

}
