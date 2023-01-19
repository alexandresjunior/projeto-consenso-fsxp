import java.util.Scanner;

public class at40 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int a, b, c;
        System.out.print("Verificador de Triângulo\n\n");

        System.out.print("Digite o lado A:");
        a = entrada.nextInt();

        System.out.print("Digite o lado B:");
        b = entrada.nextInt();

        System.out.print("Digite o lado C:");
        c = entrada.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                System.out.print("Equilátero.");
            } else if (a == b || a == c || b == c) {
                System.out.print("Isósceles.");
            } else {
                System.out.print("Escaleno.");
            }
        } else {
            System.out.print("Valores não formam um triângulo");
        }
        entrada.close();
    }
}
