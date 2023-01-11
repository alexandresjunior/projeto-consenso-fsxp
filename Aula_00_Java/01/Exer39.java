import java.util.Scanner;

public class Exer39 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        entrada.close();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n+" x " + i + " = " + (n * i));
        }
    }
}