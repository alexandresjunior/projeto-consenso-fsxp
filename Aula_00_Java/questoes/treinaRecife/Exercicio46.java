package treinaRecife;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercicio46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n;
        BigInteger fatorialM, fatorialN, soma;

        while (scanner.hasNext()) {
            m = scanner.nextInt();
            n = scanner.nextInt();
            fatorialM = BigInteger.valueOf(1);
            fatorialN = BigInteger.valueOf(1);
            soma = BigInteger.valueOf(0);

            for (int i = 1; i <= m; i++) {
                fatorialM = fatorialM.multiply(BigInteger.valueOf(i));
            }

            for (int i = 1; i <= n; i++) {
                fatorialN = fatorialN.multiply(BigInteger.valueOf(i));
            }

            soma = fatorialM.add(fatorialN);
            System.out.println(soma);
        }
    }
}
