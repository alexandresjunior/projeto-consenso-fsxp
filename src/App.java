import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um Número: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite outro Número: ");
        double n2 = sc.nextDouble();

        System.out.println("MEDIA = " + (n1 * 3.5 + n2 * 7.5) / 11);

        sc.close();
    }
}
