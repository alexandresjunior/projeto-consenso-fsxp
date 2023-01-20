import java.util.Scanner;
public class Questao09{
    /* Faça um programa que receba via teclado o tempo de duração de um evento em
uma fábrica em uma a variável do tipo inteira (int) expressa em segundos e mostre-o
expresso em horas, minutos e segundos. */ 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int horas, segundos, minutos;

        System.out.println("Insira o tempo de duração do evento:");
        int N = entrada.nextInt();

        horas = N/3600;
        minutos = ( N % 3600)/60;
        segundos = ( N % 3600) % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}