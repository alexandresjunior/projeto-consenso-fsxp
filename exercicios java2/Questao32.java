import java.util.Scanner;
public class Questao32 {
    /* Um posto de combustíveis deseja determinar qual de seus produtos tem a
preferência de seus clientes. Escreva um programa para ler o tipo de combustível
abastecido (codificado da seguinte forma: 1. Álcool 2. Gasolina 3. Diesel) e a
quantidade de litros anotados em 5 abastecimentos realizados.*/
    public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int X = 0, alcool = 0, gasolina = 0, diesel = 0, cont=0; 
		int a = 0, b = 0, c = 0;
		int somaa = 0, somab = 0, somac = 0;
		
		
		while (cont<5) {
			System.out.println("Tipo de combustível: ");
			X = entrada.nextInt();
			if (X == 1) {
				System.out.println("Quantidade de litros");
				b = entrada.nextInt();
				alcool+=1;
				somab += b;
			}else if (X == 2) {
				System.out.println("Quantidade de litros");
				a = entrada.nextInt();
				gasolina += 1;
				somaa += a;
				
			}else if (X == 3) {
				System.out.println("Quantidade de litros");
				c = entrada.nextInt();
				diesel += 1;
				somac += c;
			}
			cont++;
		}
		System.out.println("Alcool: "+alcool+" Quantidade de litros "+somab);
		System.out.println("Gasolina: "+gasolina+" Quantidade de litros "+somaa);
		System.out.print("Diesel: "+diesel+" Quantidade de litros "+somac);
    }
}
