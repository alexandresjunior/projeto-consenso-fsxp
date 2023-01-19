import java.util.Scanner;

public class at46 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int M;
        int N;


        System.out.println("Primeiro valor: ");
        M = entrada.nextInt();
        System.out.println("Segundo valor: ");
        N = entrada.nextInt();

        entrada.close();

        long fatorial = fatorial(M) + fatorial(N);
        System.out.println(fatorial);
    }

    public static long fatorial(int j) {
        long fatorial = 1;
        for (int i = 2; i <= j; i++)
            fatorial *= i;
        return fatorial;
    }

}
