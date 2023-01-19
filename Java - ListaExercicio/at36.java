import java.util.Scanner;

public class at36 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Insira o valor: ");
        numero = entrada.nextInt();

        if (numero >= 0 && numero <= 10) {
            for (int i = 1; i < numero; i++) {
                System.out.print("Ho" + " ");
            }
            System.out.println("Ho" + "!");
        }
        entrada.close();
    }

}
