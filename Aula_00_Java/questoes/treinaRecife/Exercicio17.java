package treinaRecife;

import java.util.Scanner;

public class Exercicio17 {
 public static void main(String[] args) {
	 Scanner entrada = new Scanner(System.in);
	 int n = entrada.nextInt();
     int numDivisores = 0;
     entrada.close();

     for (int i = 1 ;i<=n;i++) {
         if (n % i == 0) {
             numDivisores++;
         }

     }
     if(numDivisores != 2) {
         System.out.println("nao é primo");
     }
     else {
         System.out.println("é primo");
     }
     System.out.println(numDivisores);
}
}
