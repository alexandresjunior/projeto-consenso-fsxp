import java.util.Scanner;
public class Questao07 {
    /*Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis
(cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100,
50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias. */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira o valor inteiro:");
        int notasInseridas = entrada.nextInt();

        int valor = notasInseridas;
        int nota100 = valor/100;
        valor -= nota100 * 100;

        int nota50 = valor/50;
        valor -= nota50 * 50;

        int nota20 = valor/20;
        valor -= nota20 * 20;

        int nota10 = valor/10;
        valor -= nota10 * 10;

        int nota5 = valor/5;
        valor -= nota5 * 5;

        int nota2 = valor/2;
        valor -= nota2 * 2;
        int nota1 = valor;

        System.out.println(notasInseridas);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1 + " nota(s) de R$ 1,00");
    }
}
