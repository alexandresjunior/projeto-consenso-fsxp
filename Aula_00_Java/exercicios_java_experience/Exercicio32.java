package exercicios_java_experience;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = 0, alcool = 0, gasolina = 0, diesel = 0, cont=0; 
		int a = 0, b = 0, c = 0;
		int somaa = 0, somab = 0, somac = 0;
		
		
		while (cont<5) {
			System.out.println("Tipo de combustível: ");
			x = scanner.nextInt();
			if (x == 1) {
				System.out.println("Quantidade de litros");
				b = scanner.nextInt();
				alcool+=1;
				somab += b;
			}else if (x == 2) {
				System.out.println("Quantidade de litros");
				a = scanner.nextInt();
				gasolina += 1;
				somaa += a;
				
			}else if (x == 3) {
				System.out.println("Quantidade de litros");
				c = scanner.nextInt();
				diesel += 1;
				somac += c;
			}
			cont++;
		}
		
		
		System.out.println("Alcool: "+alcool+" Quantidade de litros  :"+somab);
		System.out.println("Gasolina: "+gasolina+" Quantidade de litros :"+somaa);
		System.out.print("Diesel: "+diesel+" Quantidade de litros  :"+somac);

	}

}
