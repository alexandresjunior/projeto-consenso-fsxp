import java.util.Scanner;

public class at44 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double valor = 0;
        double impar = 0;
        double par = 0;
        double contadorimpar = 0;
        double maiorpar = 0;
        double mediaimpar = 0;
        double diferenca = 0;
        double maior = 0;
        double menor = 0;

        for (int c = 0; c < 5; c++) {
            System.out.println("Digite o " + (c + 1) + "° valor: ");
            valor = entrada.nextDouble();

            if (valor % 2 == 0) {
                par = valor;
                if (maiorpar < par) {
                    maiorpar = par;
                }

                if (valor > maior) {
                    maior = valor;
                } else if (valor < maior) {
                    menor = valor;
                }
            } else {
                impar += valor;
                contadorimpar++;
            }

            mediaimpar = (impar / contadorimpar);
            diferenca = (maior - menor);

        }

        System.out.println("Média dos ímpares " + mediaimpar);
        System.out.println("Maior número par " + maiorpar);
        System.out.println("Diferença " + diferenca);

        entrada.close();
    }

}
