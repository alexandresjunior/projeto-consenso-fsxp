import java.util.Scanner;
public class Exercicio14 {
    public static void main(String args[]){
        int numero;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero = entrada.nextInt();

     
        if (numero % 2 == 0) {
               
            System.out.println("\n" + (numero + 1));
            System.out.println(numero + 3);
            System.out.println(numero + 5);
            System.out.println(numero + 7);
            System.out.println(numero + 9);
            System.out.println(numero + 11);
    }
        else{
            System.out.println("\n" + (numero + 2));
            System.out.println(numero + 4);
            System.out.println(numero + 6);
            System.out.println(numero + 8);
            System.out.println(numero + 10);
            System.out.println(numero + 12); 
        }
        entrada.close();
    }
}
