package javaExercicios;
import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        double consumption = sc.nextDouble();
	        sc.close();
	        double bill = 7.0; 
	        if (consumption > 10) {
	            if (consumption <= 30) {
	                bill += (consumption - 10) * 0.05;
	            } else if (consumption <= 100) {
	                bill += (consumption - 30) * 0.03 + 1;
	            } else {
	                bill += (consumption - 100) * 0.01 + 2.7 + 1;
	            }
	        }
	        System.out.printf("Valor a pagar: R$ %.2f", bill);
	    
	}

}
