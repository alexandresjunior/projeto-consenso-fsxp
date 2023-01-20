import java.util.Scanner;
public class Questao26 {
    /*Dada a altura e a idade de uma pessoa, faça um programa que identifique quantos
brinquedos ele pode andar. */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a altura:");
        double a = entrada.nextFloat();

        System.out.println("Insira a idade:");
        int i = entrada.nextInt();

        int cont = 0;

        if (a >= 1.5 && i >=12) {
            cont++;	
        }
        if (a >=1.4 && i >=14) {
                cont++;
        }
        if (a >1.7 || i >16) {
                    cont++;
        }
        
        System.out.println(cont);  
    }
}
