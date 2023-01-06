import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        entrada.close();
        int t = calcJogo(a, b);
        System.out.println(t);

    }
    public static int calcJogo(int a, int b){
        int x = 0;
            if(b > a){
                x = a - b;
                return x;
            }
            else if(a > b){
                int valor = a - b;
                x = 0;
                while(valor < 24){
                    valor++;
                    x++;
                }
                return x;
            }
            else if(a == b){
                x = 24;
            }
            return x;
    }
}
