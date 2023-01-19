import java.util.Scanner;

public class at24 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Insira um numero com 5 digitos: ");
        numero = entrada.nextInt();

        String x = Integer.toString(numero);
        String y = new StringBuilder(x).reverse().toString();

        if (x.equals(y)) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }

        entrada.close();
    }
}
