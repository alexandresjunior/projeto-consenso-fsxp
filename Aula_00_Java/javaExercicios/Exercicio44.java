package javaExercicios;
import java.util.Scanner;

public class Exercicio44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double mediaImpares = 0;
        double maiorPar = 0;
        double diferenca = 0;
        int contImpares = 0;
        double menor = 0;
        double maior = 0;

        for (int i = 0; i < 5; i++) {
            double num = sc.nextDouble();
            if (i == 0) {
                menor = num;
                maior = num;
            }
            else if (num < menor) {
                menor = num;
            }
            else if (num > maior) {
                maior = num;
            }
            if (num % 2 != 0) {
                mediaImpares += num;
                contImpares++;
            } else if (num > maiorPar) {
                maiorPar = num;
            }
        }
        diferenca = maior - menor;
        mediaImpares = mediaImpares / contImpares;

        System.out.printf("Média dos Ímpares = %.2f\n", mediaImpares);
        System.out.printf("Maior número PAR = %.2f\n", maiorPar);
        
	}
}