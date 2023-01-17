package treinaRecife;

import java.util.Scanner;

public class Exercicio42 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double v1 = entrada.nextDouble();
        double v2 = entrada.nextDouble();
        entrada.close();

        double diferenca = v2 - v1;
        double p = (diferenca / v1) * 100;
        System.out.printf("%.2f%%\n", p);
    }
}
