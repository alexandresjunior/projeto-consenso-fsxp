import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();
        double y = entrada.nextDouble();
        entrada.close();
        double r = calcConsumoMedio(x, y);
        System.out.printf("%.3f km/l",r);

    }
    public static double calcConsumoMedio(int distanciaPercorrida, double totalCombustivel){
        double cm = distanciaPercorrida / totalCombustivel;
        return cm;
    }
}
