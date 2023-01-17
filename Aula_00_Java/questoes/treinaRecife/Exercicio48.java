package treinaRecife;

import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        float peso;
        float dosagem;
        int gotas;

        System.out.print("Idade: ");
        idade = scanner.nextInt();
        System.out.print("Peso: ");
        peso = scanner.nextFloat();

        if (idade >= 12) {
            if (peso >= 60) {
                dosagem = 1000;
            } else {
                dosagem = 875;
            }
        } else {
            if (peso >= 5.0f && peso <= 9.0f) {
                dosagem = 125;
            } else if (peso > 9.0f && peso <= 16.0f) {
                dosagem = 250;
            } else if (peso > 16.0f && peso <= 24.0f) {
                dosagem = 375;
            } else if (peso > 24.0f && peso <= 30.0f) {
                dosagem = 500;
            } else {
                dosagem = 750;
            }
        }

        gotas = (int) (dosagem / (500.0f / 20.0f));

        System.out.println("Receita:");
        System.out.println("Tomar " + gotas + " gotas do medicamento.");
    }
}

