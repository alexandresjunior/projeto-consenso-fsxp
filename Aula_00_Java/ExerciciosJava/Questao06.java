import java.util.Scanner;

public class Questao06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int distancia;
        double totalDeConsumo,gasolinaPorKm;

        System.out.println("digite a distancia percorrida: ");
        distancia = entrada.nextInt();

        System.out.println("digite o total de gasolina gasto: ");
        totalDeConsumo = entrada.nextDouble();
        gasolinaPorKm = distancia / totalDeConsumo;

        System.out.println("o consumo por km foi: " + gasolinaPorKm);

        entrada.close();
    }

}
