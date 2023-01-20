import java.util.Scanner;
public class Questao26f {
    /*Dada a altura e a idade de uma pessoa, faça um programa que identifique quantos
brinquedos ele pode andar. */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a altura:");
        float a = entrada.nextFloat();

        System.out.println("Insira a idade:");
        int i = entrada.nextInt();

        int brinquedo;

        if(a >= 1.50 && i >= 12){
            if(a >= 1.40 && i >= 14){
                if (a >= 1.70 || i >= 16) {
                    System.out.println("3");
                }else{
                    System.out.println("2");
                }
            }else if(a >= 1.40 && i >= 14){
                System.out.println("2");
            }else{
                System.out.println("1");
            }
        }else{
            System.out.println("1");
        }   
    }
}
