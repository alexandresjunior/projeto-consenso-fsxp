import java.util.Scanner;
public class Questao06{
    //Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em km) e o total de combustível gasto (em litros).//
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double litros, consumo;
        int distancia;

        System.out.println(" Insira a distância percorrida em KM:");
        distancia = entrada.nextInt();

        System.out.println("Insira a quantidade de litros consumidos:");
        litros = entrada.nextDouble();

        consumo = distancia/litros;

        System.out.printf("\n Consumo Médio = %6.2f Km/L\n",consumo);
    }
}