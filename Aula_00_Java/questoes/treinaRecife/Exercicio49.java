package treinaRecife;

import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float peso;
        float altura;
        float imc;

        System.out.print("Peso: ");
        peso = scanner.nextFloat();
        System.out.print("Altura: ");
        altura = scanner.nextFloat();

        imc = peso / (altura * altura);

        System.out.println("IMC: " + imc);

        if (imc < 20) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("Peso normal");
        } else if (imc > 25 && imc <= 30) {
            System.out.println("Sobrepeso");
        } else if (imc > 30 && imc <= 40) {
            System.out.println("Obeso");
        } else {
            System.out.println("Obeso mórbido");
        }
    }
}

