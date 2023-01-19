import java.util.Scanner;

public class at42 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a;
        double b;
        

        System.out.println("Insira o valor de A:");
        a = entrada.nextDouble();

        System.out.println("Insira o valor de B:");
        b = entrada.nextDouble();

        double y = 100 * ((b - a) / a);

        System.out.println(y + "%");

        entrada.close();
    }

}
