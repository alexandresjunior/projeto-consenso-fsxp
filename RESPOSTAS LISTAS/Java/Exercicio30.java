import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int soma = 0;

        if(m > n){
            for(int i = n; i <= m; i++){
                System.out.print(i);
                soma += i;
            }
        }else{
            for(int i = m; i <= n; i++){
                System.out.print(i + " ");
                soma += i;
            }
        }
        System.out.print("Soma = " + soma);
        in.close();
    }
}
