import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int dias = in.nextInt();

        in.close();

        int anos = 0;
        int meses = 0;

        while (dias >= 30) {
            if (dias >= 365) {
                anos++;
                dias = dias - 365;
            } else if (dias >= 30) {
                meses++;
                dias = dias - 30;
            }
        }
        System.out.println(anos + " ano (s)\n" + meses + " mês (es)\n" + dias + " dia (s)");

    }
}
