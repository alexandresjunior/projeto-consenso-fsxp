package treinaRecife;

import java.util.Scanner;

public class Exercicio41 {
	 public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	        double p = entrada.nextDouble();
	        double a = entrada.nextDouble();
	        entrada.close();
	        double pIdeal = 0;
	        if (a <= 1.50) {
	            pIdeal = 50;
	        } else if (a <= 1.90) {
	            pIdeal = 70;
	        } else {
	            pIdeal = 100;
	        }

	        double d = p - pIdeal;
	        if (d == 0) {
	            System.out.println("Parabéns peso ideal!");
	        } else if (d > 0) {
	            System.out.println("Emagrecer " + d + " kg.");
	        } else {
	            System.out.println("Engordar " + -d + " kg.");
	        }
	    }
}
