import java.util.Scanner;

public class Questao15 {
    /*A sequência de números 0 1 1 2 3 5 6 8 13 21 ... é conhecida como série de
Fibonacci. Nesta sequência, cada número, depois dos 2 primeiros, é igual à soma
dos 2 anteriores. Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N
primeiros números dessa série. */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int prox, ant = 0, atual = 1;

        System.out.println("Insira um número:");
        int N = entrada.nextInt();

        for(int i = 1; i <= N; i++){
            if(i == N) System.out.println(ant);
            else System.out.println(ant+ " ");
            prox = ant + atual;
            ant = atual;
            atual = prox;
        }
    }
}
