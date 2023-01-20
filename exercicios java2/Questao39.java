import java.util.Scanner;
public class Questao39 {
    /*Elabore um programa que permita exibir na tela a tabuada de um número inteiro
informado via teclado. */
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Insira um valor:");
	int valor = entrada.nextInt();
	
	for (int i = 0;i <= 10; i++) {
		System.out.println(valor+ " x "+ i + " = "+(valor*i));
	}
}
}