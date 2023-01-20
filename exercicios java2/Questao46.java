import java.util.Scanner;
public class Questao46 {
    /* */
    public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("1° valor: ");
		int M = entrada.nextInt();
		System.out.println("2° valor: ");
		int N = entrada.nextInt();
		long fatorial = fatorial(M) + fatorial(N);
		System.out.println(fatorial);
	}

	public static long fatorial(int j) {
		long fatorial = 1;
		for (int i = 2; i <= j; i++)
			fatorial *= i;
		return fatorial;
	}
}
