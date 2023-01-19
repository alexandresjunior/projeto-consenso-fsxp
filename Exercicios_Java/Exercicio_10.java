package Exercicios_java;
import java.util.Scanner;

public class Exercicio_10 {public static void main(String[] args) {
	
	Scanner teclado= new Scanner(System.in);
	
	int quantidade=0;
	
	System.out.println("Quantidade de dias: ");
	quantidade=teclado.nextInt();
	
	teclado.close();
	
	System.out.println(quantidade/365+ " Ano(s)");
	quantidade=quantidade%365;
	System.out.println(quantidade/30+ " Mês(es)");
	quantidade=quantidade%30;
	System.out.println(quantidade + " Dia(s)");
	
	
	
	
	
	
	
	
}

}
