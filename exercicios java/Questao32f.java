import java.util.Scanner;
public class Questao32f {
    /* Um posto de combustíveis deseja determinar qual de seus produtos tem a
preferência de seus clientes. Escreva um programa para ler o tipo de combustível
abastecido (codificado da seguinte forma: 1. Álcool 2. Gasolina 3. Diesel) e a
quantidade de litros anotados em 5 abastecimentos realizados.*/
    public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int tipo = 0;
		while (tipo != 4) {
			System.out.println("Insira o número:");
            tipo = leitor.nextInt();
			while (tipo < 1 || tipo > 4) {
				System.out.println("Insira o número");
                tipo = leitor.nextInt();
			}
			switch (tipo) {
				case 1: alcool++; break;
				case 2: gasolina++; break;
				case 3: diesel++; break;
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
    }
}
