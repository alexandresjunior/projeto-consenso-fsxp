package treinaRecife;

import java.util.Scanner;

public class Exercicio27 {
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    int a = entrada.nextInt();
	    int b = entrada.nextInt();
	    int c = entrada.nextInt();
	    int d = entrada.nextInt();
	    entrada.close();
	    double media = (a + b + c + d) / 4.0;

	    if (a < 110) {
	      System.out.println(a + " normal");
	    } else if (a >= 110 && a <= 125) {
	      System.out.println(a +" alterada");
	    } else {
	      System.out.println(a +" muito alta");
	    }
	    if (b < 110) {
	      System.out.println(b + " normal");
	    } else if (b >= 110 && b <= 125) {
	      System.out.println(b +" alterada");
	    } else {
	      System.out.println(b +" muito alta");
	    }
	    if (c < 110) {
	      System.out.println(c + " normal");
	    } else if (c >= 110 && c <= 125) {
	      System.out.println(c + " alterada");
	    } else {
	      System.out.println(c + " muito alta");
	    }
	    if (d < 110) {
	      System.out.println(d + " normal");
	    } else if (d >= 110 && d <= 125) {
	      System.out.println(d + " alterada");
	    } else {
	      System.out.println(d + " muito alta");
	    }

	    System.out.println("média: " + media);
	  }
}
