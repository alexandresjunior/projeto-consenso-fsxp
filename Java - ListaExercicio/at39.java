import java.util.Scanner;

public class at39 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor da tabuada: ");
        int valor = entrada.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(valor + " X " + i + " = " + (valor * i));
        }

        entrada.close();

    }
}
