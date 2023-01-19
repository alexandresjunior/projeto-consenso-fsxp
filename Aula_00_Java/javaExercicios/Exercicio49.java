package javaExercicios;
import java.util.Scanner;

public class Exercicio49 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        float peso = sc.nextFloat();
        float altura = sc.nextFloat();

        float imc = peso / (altura * altura);

        System.out.print("IMC = " + imc + " - ");

        if (imc < 20) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("Peso Normal");
        } else if (imc > 25 && imc <= 30) {
            System.out.println("Sobrepeso");
        } else if (imc > 30 && imc <= 40) {
            System.out.println("Obeso");
        } else {
            System.out.println("Obeso Mórbido");
        }
    }
}