import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        entrada.close();
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i));
        }
    }
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
