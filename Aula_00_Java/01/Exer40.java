import java.util.Scanner;

public class Exer40 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int lado1 = entrada.nextInt();
        int lado2 = entrada.nextInt();
        int lado3 = entrada.nextInt();
        entrada.close();
        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo equilátero.");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("Triângulo isósceles.");
            } else {
                System.out.println("Triângulo escaleno.");
            }
        } else {
            System.out.println("VALORES NÃO FORMAM UM TRIÂNGULO");
        }
    }
}