package treinaRecife;
import java.util.Scanner;
public class Exercicio04 {
	public static void main(String[] args) {
		
		int valor1, valor2, valor3;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite um valor para ser inserido: ");
		valor1 = entrada.nextInt();
		
		System.out.println("digite um valor para ser inserido: ");
		valor2 = entrada.nextInt();
		
		System.out.println("digite um valor para ser inserido: ");
		valor3 = entrada.nextInt();
		
		entrada.close();
		
		int maior = valor1;
		int menor = valor1;
		
		if (valor2 > valor3 && valor2 > valor1) {
			maior = valor2;
		}
		else if(valor3 > valor2 && valor3 > valor1) {
			maior = valor3;
		}
		if ( valor2 < valor1 && valor2 < valor3) {
			menor = valor2;
		}
		else if ( valor3 < valor1 && valor3 < valor2) {
			menor = valor3;
		}
		
		System.out.println("o maior valor é : " + maior);
		System.out.println("o menor valor é: "+ menor);
		
		
		
	}
}