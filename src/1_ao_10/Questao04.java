import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("- ");
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        System.out.println("MAIOR = " + array[n - 1]);
        System.out.println("MENOR = " + array[0]);

        sc.close();

    }
}
