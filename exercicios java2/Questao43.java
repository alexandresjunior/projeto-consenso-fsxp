import java.util.Scanner;
public class Questao43 {
    /*Gilberto é um famoso vendedor de esfirras na região. Porém, apesar de todos
gostarem de suas esfihas, ele só sabe dar o troco com duas notas, ou seja, nem
sempre é possível receber o troco certo. Para facilitar a vida de Gil, escreva um
programa para ele que determine se é possível ou não devolver o troco exato
utilizando duas notas.
 */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    boolean possivel = false;

    System.out.println("Valor da compra");
    int N = entrada.nextInt();

    System.out.println("Valor pago: ");
    int M = entrada.nextInt();

    int troco = M - N;
    int[] notas = { 2, 5, 10, 20, 50, 100 };


    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 6; j++) {
            if (troco - notas[j] == notas[i])
                possivel = true;
        }
    }

    if (possivel)
        System.out.println("Possível");
    else
        System.out.println("Impossível");
}
}