import java.util.Scanner;
public class Questao18 {
    
/*Faça um programa que inverta um número inteiro com quatro algarismos.*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a seguir o número a ser invertido: ");
			int numero = entrada.nextInt();
			
		
			int i = 0;

			 while (numero > 0) {
			 i *= 10;
			 i += (numero % 10);
			 numero /= 10;
			 } 
			 
			 System.out.printf("O número invertido é: %d.\n", i);
    }
}
