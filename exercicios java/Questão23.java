import java.util.Scanner;
public class Questão23 {
    /*Faça um programa que leia dois valores inteiros (x e y) e imprima na tela o
resultado das seguintes comparações entre estes dois valores, exatamente nesta
ordem: */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o 1° valor:");
        int x = entrada.nextInt();

        System.out.println("Insira o 2° valor:");
        int y = entrada.nextInt();

        if(x > y){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
        if(x == y){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
        if(x < y){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
        if(x != y){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
        if(x >= y){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
        if(x <= y){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

    }
}
