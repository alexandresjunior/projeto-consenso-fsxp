import java.util.Scanner;
public class Questao33 {
    /* Escreva um programa que leia um valor inteiro N. Este N é a quantidade de
linhas de saída que serão apresentadas na execução do programa.
*/
    public static void main(String[] args)  {
		Scanner entrada = new Scanner(System.in);
		
        System.out.println("Insira o número:");
        int N = entrada.nextInt();
		int cont = 1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(cont + " ");
				cont++;
			}
			System.out.println("PUM");
			cont++;
		}
    
}
}
