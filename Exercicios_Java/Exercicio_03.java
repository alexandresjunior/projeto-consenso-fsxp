package Exercicios_java;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_03 {public static void main(String[] args) {
	
	Scanner teclado=new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("###.##");
	
	double salario=0;
	double vendas=0;
	double total=0;
	
	System.out.println("Nome do vendedor: ");
	String nome=teclado.next();
	
	System.out.println("Valor salario fixo: ");
	salario=teclado.nextDouble();
	
	System.out.println("Total de vendas mês: ");
	vendas=teclado.nextDouble();
	
	teclado.close();
	
	total=((vendas*15)/100)+salario;
	
	System.out.println("TOTAL = R$ "+df.format(total));
	
	
	

	
	
}

}
