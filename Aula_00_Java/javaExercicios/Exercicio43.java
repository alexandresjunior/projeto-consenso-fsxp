package javaExercicios;
import java.util.Scanner;

public class Exercicio43 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int purchase = sc.nextInt();
        int paid = sc.nextInt();
        int change = paid - purchase;

        int[] notes = {2, 5, 10, 20, 50, 100};

        boolean possible = false;
        for (int i = 0; i < notes.length; i++) {
            for (int j = 0; j < notes.length; j++) {
                if (notes[i] + notes[j] == change) {
                    possible = true;
                    break;
                }
            }
        }

        if (possible) {
            System.out.println("Possível");
        } else {
            System.out.println("Impossível");
        }
    }
}