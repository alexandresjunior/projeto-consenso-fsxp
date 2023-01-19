package javaExercicios;
import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        double alcoolLitros = 0;
        double gasolinaLitros = 0;
        double dieselLitros = 0;

        for (int i = 0; i < 5; i++) {
            int tipoCombustivel = scanner.nextInt();
            double quantidadeLitros = scanner.nextDouble();

            switch (tipoCombustivel) {
                case 1:
                    alcool++;
                    alcoolLitros += quantidadeLitros;
                    break;
                case 2:
                    gasolina++;
                    gasolinaLitros += quantidadeLitros;
                    break;
                case 3:
                    diesel++;
                    dieselLitros += quantidadeLitros;
                    break;
                default:
                    break;
            }
        }

        System.out.println("1. Álcool: " + alcool + " - Qtd Litros: " + alcoolLitros);
        System.out.println("2. Gasolina: " + gasolina + " - Qtd Litros: " + gasolinaLitros);
        System.out.println("3. Diesel: " + diesel + " - Qtd litros: " + dieselLitros);
    }
}

