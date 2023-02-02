import java.math.BigInteger;
import java.util.Scanner;

public class Exer46 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (entrada.hasNext()) {
            int m = entrada.nextInt();
            int n = entrada.nextInt();

            BigInteger FatorialM = BigInteger.valueOf(1);
            for (int i = 1; i <= m; i++) {
                FatorialM = FatorialM.multiply(BigInteger.valueOf(i));
            }

            BigInteger fatorialN = BigInteger.valueOf(1);
            for (int i = 1; i <= n; i++) {
                fatorialN = fatorialN.multiply(BigInteger.valueOf(i));
            }

            System.out.println(FatorialM.add(fatorialN));
        }
        entrada.close();
    }
}