import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int entrada = in.nextInt();
        int n_divisoes = 0;

        for (int j = 2; j < entrada; j++) {
            if (entrada % j == 0) { // é divisivel
                n_divisoes++;
            }
        }

        if (n_divisoes != 0 || entrada == 0 || entrada == 1) {
            System.out.println("NÃO É PRIMO");
        } else {
            System.out.println("É PRIMO");
        }
        in.close();
    }
}
