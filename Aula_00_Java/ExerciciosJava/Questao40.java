
import java.util.Scanner;

public class Questao40 {
 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o primeiro lado do triangulo:");
        int a = entrada.nextInt();

        System.out.println("Digite o segundo lado do triangulo:");
        int b = entrada.nextInt();

        System.out.println("Digite o terceiro lado do triangulo:");
        int c = entrada.nextInt();

        entrada.close();

        if(a < (b+c) && b < (a+c) && c < (a+b)){

            if(a==b && a==c){
                System.out.println("EQUILÁTERO");
            }else if((a == b && a != c) || (a == c && a !=b)){
                System.out.println("ISOSCELES");
            }else{
                System.out.println("escaleno");
            }

        }else{
            System.out.println("VALORES NÃO FORMAM UM TRIANGULO");
        }
    }

}
