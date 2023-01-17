package treinaRecife;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        for (int i = 0; i < 5; i++) {
            int tipoCombustivel = scanner.nextInt();
            double quantidadeLitros = scanner.nextDouble();
            switch (tipoCombustivel) {
                case 1:
                    alcool += quantidadeLitros;
                    break;
                case 2:
                    gasolina += quantidadeLitros;
                    break;
                case 3:
                    diesel += quantidadeLitros;
                    break;
            }
        }

        System.out.println("Alcool: " + alcool + " litros");
        System.out.println("Gasolina: " + gasolina + " litros");
        System.out.println("Diesel: " + diesel + " litros");
    }
}
