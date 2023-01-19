package javaExercicios;
import java.util.Scanner;

public class Exercicio40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (isTriangle(a, b, c)) {
            if (a == b && b == c) {
                System.out.println("EQUILÁTERO");
            } else if (a == b || a == c || b == c) {
                System.out.println("ISÓSCELES");
            } else {
                System.out.println("ESCALENO");
            }
        } else {
            System.out.println("VALORES NÃO FORMAM UM TRIÂNGULO");
        }
    }

    public static boolean isTriangle(int a, int b, int c) {
        return (a < b + c) && (b < a + c) && (c < a + b);
    }
}
