package treinaRecife;
import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        boolean ePrimo = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                ePrimo = false;
                break;
            }
        }

        if (ePrimo) {
            System.out.println("É PRIMO");
        } else {
            System.out.println("NÃO É PRIMO");
        }
    }
}
