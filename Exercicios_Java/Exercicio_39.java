package Exercicios_java;
import java.util.Scanner;

public class Exercicio_39 {public static void main(String[] args) {
	
	Scanner teclado=new Scanner(System.in);
	
	System.out.println("Digite o valor da tabuada");
	int valor= teclado.nextInt();
	
	for (int c=0;c<=10;c++) {
		System.out.println(valor+ " X "+ c + " = "+(valor*c));
	}
		
	teclado.close();	
		
	}
	
	
	
	
	
	
}


