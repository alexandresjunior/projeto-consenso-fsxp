package javaExercicios;
import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int contador = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(contador + " ");
                contador++;
            }
            System.out.println("PUM");
            contador++;
        }
    }
}
