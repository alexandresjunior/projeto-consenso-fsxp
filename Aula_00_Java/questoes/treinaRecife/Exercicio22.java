package treinaRecife;

import java.util.Scanner;

public class Exercicio22 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
    int a = entrada.nextInt();
    entrada.close();
    int d1 = a / 10000; 
    int d2 = (a % 10000) / 1000; 
    int d3 = (a % 1000) / 100; 
    int d4 = (a % 100) / 10; 
    int d5 = a % 10; 

    if (d1 == d5 && d2 == d4) { 
      System.out.println("S");
    } else {
      System.out.println("N");
    }
}
}
