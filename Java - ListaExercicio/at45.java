import java.util.Arrays;
import java.util.Scanner;

public class at45 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[5];
        int[] idades = new int[5];
        int menorAtual = 0;
        String menorIdade = "";
        double soma = 0;

        System.out.println("Insira seu nome:");
        nomes = entrada.nextLine();

        System.out.println("Insira seu nome:");
        idades = entrada.nextInt();

        for (int i = 0; i < idades.length; i++) {
            String[] inicio = entrada.nextLine().split(" ");
            nomes[i] = inicio[0];
            idades[i] = Integer.parseInt(inicio[1]);

            if (i == 0) {
                menorAtual = idades[i];
            }
            if (idades[i] < menorAtual) {
                menorAtual = idades[i];
                menorIdade = nomes[i];
            }
            soma += idades[i];
        }

        entrada.close();
        Arrays.sort(idades);

        System.out.println("Maior idade = " + idades[4]);
        System.out.println("Nome da pessoa mais nova = " + menorIdade);
        System.out.println("Média das idades = " + soma / 5);

    }

}
