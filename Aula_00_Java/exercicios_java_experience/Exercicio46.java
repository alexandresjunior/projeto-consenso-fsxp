package exercicios_java_experience;
import java.math.BigInteger;
import java.util.Scanner;

public class Exercicio46 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        while (scanner.hasNext()) {
	            int m = scanner.nextInt();
	            int n = scanner.nextInt();

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
	        scanner.close();

	}

}
