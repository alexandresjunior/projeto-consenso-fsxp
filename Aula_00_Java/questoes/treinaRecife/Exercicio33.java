package treinaRecife;

import java.util.Scanner;

public class Exercicio33 {
	 public static void main(String[] args) {
		    Scanner entrada = new Scanner(System.in);
		    int n = entrada.nextInt();
		    entrada.close();

		    for (int i = 1; i <= n * 4; i++) {
		      if (i % 4 == 0) {
		        System.out.println("PUM");
		      } else {
		        System.out.print(i + " ");
		      }
		    }
		  }
}
