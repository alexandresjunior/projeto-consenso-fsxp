import java.util.Scanner;

public class at34 {
 
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantidade de números na linha: ");
        int X = entrada.nextInt();
        System.out.println("Valor: ");
        int Y = entrada.nextInt();
        for (int i = 1; i <= Y; i++) {
            System.out.print(i);
            if (i % X == 0)
                System.out.println("");
            else
                System.out.print(" ");

        }
        entrada.close();

    }
}
