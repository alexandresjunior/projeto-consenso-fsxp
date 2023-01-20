import java.util.Scanner;
public class Questao44 {
    /*Faça um programa que leia cinco números com dupla precisão(double)
diferentes entre si e imprima: a Média dos ímpares, o Maior número par e a
Diferença entre o maior e o menor número informado.
 */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    double valor = 0, impar = 0, par = 0, maior = 0, menor = 0;
    double contimpar = 0, maiorP = 0,mediaI = 0,diferenca = 0;
    

    for (int c = 0; c < 5; c++) {
        System.out.println("Insira o valor:");
        valor = entrada.nextDouble();
        if (valor % 2 == 0) {
            par = valor;
            if (maiorP < par) {
                maiorP = par;
            }

            if (valor > maior) {
                maior = valor;
            } else if (valor < maior) {
                menor = valor;
            }
        } else {
            impar += valor;
            contimpar++;
        }

        mediaI = (impar / contimpar);
        diferenca = (maior - menor);

    }

    System.out.println("Média dos ímpares: " + mediaI);
    System.out.println("Maior número par: " + maiorP);
    System.out.println("Diferença: " + diferenca);
}
}