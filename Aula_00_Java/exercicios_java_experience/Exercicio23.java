package exercicios_java_experience;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("(x): ");
        int x = scanner.nextInt();
        System.out.print("(y): ");
        int y = scanner.nextInt();
        scanner.close();

       
        System.out.println("x é maior que y? " + (x > y));
        System.out.println("x é igual a y? " + (x == y));
        System.out.println("x é menor que y? " + (x < y));
        System.out.println("x é diferente de y? " + (x != y));
        System.out.println("x é maior ou igual a y? " + (x >= y));
        System.out.println("x é menor ou igual a y? " + (x <= y));

	}

}
