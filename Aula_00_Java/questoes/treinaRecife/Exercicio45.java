package treinaRecife;

import java.util.Scanner;

public class Exercicio45
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];
        float[] idades = new float[5];
        float maiorIdade = 0;
        float menorIdade = Float.MAX_VALUE;
        String nomeMenorIdade = "";
        float somaIdades = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Nome: ");
            nomes[i] = scanner.nextLine();
            System.out.print("Idade: ");
            idades[i] = scanner.nextFloat();
            scanner.nextLine();
            somaIdades += idades[i];

            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
            }

            if (idades[i] < menorIdade) {
                menorIdade = idades[i];
                nomeMenorIdade = nomes[i];
            }
        }

        float mediaIdades = somaIdades / 5;
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Nome da pessoa mais nova: " + nomeMenorIdade);
        System.out.println("Média das idades: " + mediaIdades);
    }
}
