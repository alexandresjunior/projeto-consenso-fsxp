import java.util.Scanner;

public class at26 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double altura;
        int idade;
        int contador = 0;

        System.out.println("Altura: ");
        altura = entrada.nextDouble();

        System.out.println("Idade: ");
        idade = entrada.nextInt();

        if (altura >= 1.5 && idade >= 12) {
            contador++;
        }
        if (altura >= 1.4 && idade >= 14) {
            contador++;
        }
        if (altura > 1.7 || idade > 16) {
            contador++;
        }

        System.out.println(contador);

        entrada.close();
    }
}
