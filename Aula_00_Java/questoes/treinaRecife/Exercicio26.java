package treinaRecife;

import java.util.Scanner;

public class Exercicio26 {
	public static void main(String[] args) {
	    Scanner entrada= new Scanner(System.in);
	    float a = entrada.nextFloat();
	    int b = entrada.nextInt();
	    a = a * 100;
	    entrada.close();

	    int count = 0; 
	    System.out.println(a);
	    if (a >= 150 && b >= 12) { 
	    }
	    if (a >= 140 && b >= 14) { 
	      count++;
	    }
	    if (a >= 170 || b >= 16) { 
	      count++;
	    }
	    System.out.println(count); 
	  }
}
