import java.util.Scanner;
public class Questao17 {
    /*Na matemática, um Número Primo é aquele que pode ser dividido somente por 1
(um) e por ele mesmo. Por exemplo, o número 7 é primo, pois pode ser dividido
apenas pelo número 1 e pelo número 7.
 */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a quantidade de testes: ");
        int N = entrada.nextInt();
        
        int x, cont;

        for(int i = 0; i < N; i++){
            cont = 0;
            System.out.println("Insira um número:");
            x = entrada.nextInt();
            for(int k = 2; k < x; k++){
                if(x % k == 0) cont++;
            }
            if(cont == 0) System.out.println(x+ " É primo!");
            else System.out.println(x+ " Não é primo!");
        }
    }
}
