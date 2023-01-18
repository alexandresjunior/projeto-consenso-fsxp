import java.util.Scanner;
public class Exercicio06 {
    public static void main (String[]args) {
        double km;
        double litros;
        double consumo;

    Scanner entrada = new Scanner(System.in) ;
	System.out.println("Digite a distância percorrida em km: " );
    km= entrada.nextDouble();
	System.out.println("Digite o total de combustível gasto em litros: " );
    litros = entrada.nextDouble();

    consumo = (km/litros);

    System.out.println(consumo + " km/l");
    entrada.close();

    }
}
