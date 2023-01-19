package javaExercicios;
import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        System.out.println(x > y ? 1 : 0);
        System.out.println(x == y ? 1 : 0);
        System.out.println(x < y ? 1 : 0);
        System.out.println(x != y ? 1 : 0);
        System.out.println(x >= y ? 1 : 0);
        System.out.println(x <= y ? 1 : 0);

        scan.close();
    }

}
