import java.util.Scanner;

public class at41 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double altura; 
        double peso;

        System.out.println("Insira sua altura:");
        altura = entrada.nextDouble();

        System.out.println("Insira seu peso:");
        peso = entrada.nextDouble();

        if (altura < 1.50) {
            if (peso < 50) {
                System.out.println("Engorde " + (50 - peso) + " kg");
            } else if (peso == 50) {
                System.out.println("Parabéns peso ideal!");
            } else {
                System.out.println("Emagreça " + (peso - 50) + " kg");
            }
        } else if (altura >= 1.51 && altura < 1.90) {
            if (peso < 70) {
                System.out.println("Engorde " + (70 - peso) + " kg");
            } else if (peso == 70) {
                System.out.println("Parabéns peso ideal!");
            } else {
                System.out.println("Emagreça " + (peso - 70) + " kg");
            }
        } else {
            if (peso < 100) {
                System.out.println("Engorde " + (100 - peso) + " kg");
            } else if (peso == 100) {
                System.out.println("Parabéns peso ideal!");
            } else {
                System.out.println("Emagreça " + (peso - 100) + " kg");
            }
        }
        entrada.close();
    }

}
