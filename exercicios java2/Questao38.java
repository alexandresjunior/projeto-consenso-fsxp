import java.util.Scanner;
public class Questao38 {
    /* Elabore um programa que permita receber um número inteiro via teclado e
imprimir se o número recebido é primo ou não. Sabe-se que um número é primo
quando é apenas divisível por 1 e por ele mesmo. */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int v = 0;
    boolean nPrimo;

    System.out.println("Insira um valor: ");
    v = entrada.nextInt();

    if (v == 2) {
        nPrimo = true;
    } else if (v % 2 == 0) {
        nPrimo = false;
    } else {
        nPrimo = true;
        for (int i = 3; i < v; i += 2) {
            if (v % i == 0) {
                nPrimo = false;
                break;
            }
        }
    }

    if (nPrimo) {
        System.out.println("É primo");
    } else {
        System.out.println("Não é primo");
    }
}
}
