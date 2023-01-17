package treinaRecife;

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        double num4 = scanner.nextDouble();
        double num5 = scanner.nextDouble();

        double mediaImpares = 0.0;
        int qtdImpares = 0;
        double maiorPar = 0.0;
        double menorNum = Double.MAX_VALUE;
        double maiorNum = Double.MIN_VALUE;

        double[] numeros = {num1, num2, num3, num4, num5};
        for (double num : numeros) {
            if (num % 2 != 0) {
                mediaImpares += num;
                qtdImpares++;
            } else {
                if (num > maiorPar) {
                    maiorPar = num;
                }
            }
            if (num > maiorNum) {
                maiorNum = num;
            }
            if (num < menorNum) {
                menorNum = num;
            }
        }

        if (qtdImpares > 0) {
            mediaImpares /= qtdImpares;
            System.out.println("Média dos ímpares: " + mediaImpares);
        } else {
            System.out.println("Não há números ímpares para calcular a média");
        }
        if (maiorPar > 0) {
        System.out.println("Maior número par: " + maiorPar);
        } else {
        System.out.println("Não há números pares");
        }
        System.out.println("Diferença entre o maior e o menor número: " + (maiorNum - menorNum));
        }
        }
