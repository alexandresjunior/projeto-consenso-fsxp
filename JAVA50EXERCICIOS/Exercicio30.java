import java.util.Scanner;
public class Exercicio30 {
    /* Leia um conjunto 3 (três) pares de valores M e N. Para cada par lido, mostre a
sequência do menor até o maior e a soma dos inteiros consecutivos entre eles
(incluindo o N e M).
 */
    public static void main(String[] args) {
        int X, Y;
        int soma = 0;
        Scanner entrada =new Scanner(System.in);
        System.out.print("Digite um numero: ");
        X = entrada.nextInt();
        System.out.print("Digite um numero: ");
        Y = entrada.nextInt();
        
        if ( X >= Y){
            while (X >= Y){
                soma = soma + Y;
                System.out.print(Y + "  ");
                Y++;
        }
        }
        
        else if (Y > X){
            while (Y >= X){
            soma = soma + X;
            System.out.print(X + "  ");
            X++;
        }
        }
        entrada.close();
        System.out.print(" " + soma);
      
    
   
     }
}