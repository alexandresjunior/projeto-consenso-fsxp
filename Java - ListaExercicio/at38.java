import java.util.Scanner;

public class at38 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int valor = 0;
        boolean numeroPrimo;

        System.out.println("Insira um valor: ");
        valor = entrada.nextInt();

        if (valor == 2) {
            numeroPrimo = true;
        } else if (valor % 2 == 0) {
            numeroPrimo = false;
        } else {
            numeroPrimo = true;
            for (int i = 3; i < valor; i += 2) {
                if (valor % i == 0) {
                    numeroPrimo = false;
                    break;
                }
            }
        }

        if (numeroPrimo) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }
        entrada.close();
    }

}
