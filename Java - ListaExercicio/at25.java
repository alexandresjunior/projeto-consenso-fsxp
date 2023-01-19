import java.util.Scanner;

public class at25 {
    
    public static void main(String[] args) {
         
        Scanner entrada = new Scanner(System.in);
        int trabalho;
        int contador = 0;

        System.out.println("Insira os valores: ");
        trabalho = entrada.nextInt();

        String x = Integer.toString(trabalho);
        char[] y = x.toCharArray();

        if (y[0] == '1') {
            contador++;
        }
        if (y[1] == '1') {
            contador++;
        }
        if (y[2] == '1') {
            contador++;
        }
        if (y[3] == '1') {
            contador++;
        }
        if (y[4] == '1') {
            contador++;
        }

        if (contador == 4) {
            System.out.println("Avaliado");
        } else {
            System.out.println("ZERO(0)");
        }

        entrada.close();
    }
}
