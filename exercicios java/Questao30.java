import java.util.Scanner;
public class Questao30 {
    /* Leia um conjunto 3 (três) pares de valores M e N. Para cada par lido, mostre a
sequência do menor até o maior e a soma dos inteiros consecutivos entre eles
(incluindo o N e M).
 */
    public static void main(String[] args) {
    Scanner entrada =new Scanner(System.in);
 
        int X, Y;
 
      while (((X = entrada.nextInt()) > 0 )&&((Y = entrada.nextInt()) > 0 )) {
 
        int soma = 0;
 
        if (X > Y) {
            for (Y = Y; Y <= X; Y++) {
                soma += Y;
                System.out.print(Y+" ");
            }
                 System.out.print("Soma = "+soma+"\n");
         }else {
            for (X = X; X <= Y; X++) {
                soma += X;
                System.out.print(X+" ");
            }
                System.out.print("Soma = "+soma+"\n");
             }
         }
     }
}
