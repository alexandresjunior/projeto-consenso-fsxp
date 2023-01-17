package treinaRecife;
import java.util.Scanner;


//10. Leia um valor inteiro correspondente à idade de uma pessoa em dias
//e informe-a em anos, meses e dias. Obs: Apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias.
//Entrada
//O arquivo de entrada contém um valor inteiro. 


public class Exercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor, ano, mes, dia;
		
		System.out.println("digite a quantidade de dias: ");
		
		valor = sc.nextInt();
		sc.close();
		ano = valor / 365;
		valor = valor % 365;
		System.out.println(ano +"Ano");
		mes = valor / 30;
		System.out.println(mes+"mes");
		valor = valor % 30;
		dia = valor;
		System.out.println(dia+" dia");
		
	}
	
	
	
	
}
