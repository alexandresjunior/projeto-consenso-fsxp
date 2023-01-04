import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        int menor = a;
        int maior = a;
        if (b > maior) maior = b;
        if (c > maior) maior = c;
        if (b < menor) menor = b;
        if (c < menor) menor = c;
        System.out.println("MAIOR = " + maior + "\nMENOR = 14 " + menor);
    }
}
