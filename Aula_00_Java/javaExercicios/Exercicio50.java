package javaExercicios;
import java.util.Scanner;

public class Exercicio50 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cont = 0;
        for (int i = 1; i <= n; i++) {
            String andar = Integer.toString(i);
            if (andar.contains("4") || andar.contains("13")) {
                cont++;
            }
        }
        int numeroAtribuido = n + cont;
        System.out.println(numeroAtribuido);
    }
}