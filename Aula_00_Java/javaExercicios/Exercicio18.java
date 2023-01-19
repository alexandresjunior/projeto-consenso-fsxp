package javaExercicios;
import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
	        int number = sc.nextInt();
	        sc.close();

	        String reversed = new StringBuilder(Integer.toString(number)).reverse().toString();
	        System.out.println(reversed);
	    }
	
}
