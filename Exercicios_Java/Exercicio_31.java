package Exercicios_java;
import java.util.Scanner;

public class Exercicio_31 {public static void main(String[] args) {
	
	Scanner teclado=new Scanner(System.in);
	double nota1=-1, nota2=-1;

	System.out.println("Digite a primeira nota: ");
	while (nota1 < 0 || nota1 > 10){
		nota1 = teclado.nextDouble();
		if (nota1 < 0 || nota1 > 10)
			System.out.println("NOTA INVÁLIDA");
	}
	System.out.println("Digite a segunda nota: ");
	while (nota2 < 0 || nota2 > 10){
		nota2 = teclado.nextDouble();
		if (nota2 < 0 || nota2 > 10)
			System.out.println("NOTA INVÁLIDA");
	}
	System.out.printf("media = %.2f\n", (nota1 + nota2) / 2);
	teclado.close();
}
}
