import java.util.Scanner;

public class Exer42 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double va = entrada.nextDouble();
        double vn = entrada.nextDouble();
        entrada.close();

        double diferenca = vn - va;
        double p = (diferenca / va) * 100;
        System.out.printf("%.2f%%\n", p);
    }
}