import java.util.Scanner;
public class Questao14 {
    /*Leia um valor inteiro X. Em seguida apresento os 6 valores ímpares
consecutivos a partir do X, um valor por linha, Inclusive o X se for o caso.
 */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número:");
        int x = entrada.nextInt();

        int cont = 0;

        while(cont < 6) {
            if( x % 2==1){
                System.out.println(x);
                cont++;
            }x++;
        }
    }
}
