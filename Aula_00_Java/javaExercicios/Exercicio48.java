package javaExercicios;
import java.util.Scanner;

public class Exercicio48 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt();
        float peso = scanner.nextFloat();

        int dosagem = 0;
        if (idade >= 12) {
            if (peso >= 60) {
                dosagem = 1000;
            } else {
                dosagem = 875;
            }
        } else {
            if (peso >= 30) {
                dosagem = 750;
            } else if (peso >= 24.1) {
                dosagem = 500;
            } else if (peso >= 16.1) {
                dosagem = 375;
            } else if (peso >= 9.1) {
                dosagem = 250;
            } else {
                dosagem = 125;
            }
        }

        int gotas = (int) Math.round(dosagem / 500.0 * 20);
        System.out.println(gotas + " gotas");
    }
}