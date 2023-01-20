import java.util.Scanner;
public class Questao34 {
    /*Escreva um programa que leia dois valores X e Y. A seguir, mostre uma
sequência de 1 até Y, passando para a próxima linha a cada X números. */
    public static void main(String[] args)  {
		Scanner entrada = new Scanner(System.in);
		
        System.out.println("Insira o 1° valor:");
        int X = entrada.nextInt();
        System.out.println("Insira o 2° valor:");
		int Y = entrada.nextInt();
		int cont = 1;
		for (int i = 1; i <= Y; i++) {
			System.out.print(i);
			if (i % X == 0) System.out.println("");
			else System.out.print(" ");

		}
    }
}
