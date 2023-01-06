import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String n = entrada.nextLine();
        double f = entrada.nextDouble();
        double c = entrada.nextDouble();
        double s = calcComissao(c) + f;
        entrada.close();
        System.out.printf("TOTAL = R$ %.2f %n", s);
    }
    public static double calcComissao(double c){
        double x = c*0.15;
        return x;
    }
}
