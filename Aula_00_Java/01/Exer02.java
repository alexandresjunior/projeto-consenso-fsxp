import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        int a = entrada.nextInt();
        double b = entrada.nextDouble();
        double r = calcSalario(a, b);
        entrada.close();
        System.out.printf("NÚMERO = "+ n + "\nSALÁRIO = R$ %.2f %n", r);
    }
    public static double calcSalario(int h, double vh){
        double x = h * vh;
        return x;
    }
}
