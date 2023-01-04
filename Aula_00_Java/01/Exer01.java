import java.util.Scanner;

public class Exer01{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double r = media(a,b);
        System.out.printf("MÉDIA = %.5f %n", r);
    }
    public static double media(double a, double b){
        double x = ((a*3.5) + (b*7.5)) / 11;
        return x;
    }
}