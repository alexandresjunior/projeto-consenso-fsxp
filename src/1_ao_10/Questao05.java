import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        /*
         * Faça um programa que leia do teclado três valores inteiros e exiba-os em
         * ordem
         * crescente.
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("- ");
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        for (int a : array) {
            System.out.println(a);
        }

        sc.close();
    }
}