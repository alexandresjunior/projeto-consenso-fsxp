package Exercicios_java;
import java.util.Scanner;

public class Exercicio_34 {public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Quantidade de números na linha: ");
	int X = teclado.nextInt();
	System.out.println("Valor: ");
	int Y = teclado.nextInt();
	
	for (int i = 1; i <= Y; i++) {
		System.out.print(i);
		if (i % X == 0) System.out.println("");
		else System.out.print(" ");

	}
	teclado.close();
	
	
	
}

}
