package javaExercicios;
import java.util.Scanner;

public class Exercicio38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (isPrime(number)) {
            System.out.println("É PRIMO");
        } else {
            System.out.println("NÃO É PRIMO");
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

