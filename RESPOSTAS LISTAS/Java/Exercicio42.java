import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble(), b = in.nextDouble();
        
        double y = 100 * ((b-a)/a);

        System.out.println(y + "%");

        in.close();
    }
}
