package Exercicios_java;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_02 {public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("####.##");
	
	int num=0;
	int hora=0;
	double valor=0;
	double salario=0;
	
	System.out.println("Digite seu número: ");
	num=teclado.nextInt();
	
	System.out.println("Quantidade de horas trabalhadas: ");
	hora= teclado.nextInt();
	
	System.out.println("Valor da hora trabalhada: ");
	valor=teclado.nextDouble();
	
	teclado.close();
	
	salario=(hora*valor);
	
	System.out.println("NUMERO = "+num);
	System.out.println("SALARIO = R$ "+df.format(salario));
	
	
	
	
	
}

}
