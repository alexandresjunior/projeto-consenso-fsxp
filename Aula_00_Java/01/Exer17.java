import java.util.Scanner;

public class Exer17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        int d = entrada.nextInt();
        entrada.close();
        simples(a);
        simples(b);
        simples(c);
        simples(d);
    }
    public static void simples(int v){
        if(v == 3){
            System.out.println(v + " é primo");
        }
        else{
            if(v % 3 == 1 && v % v == 0){
                System.out.println(v + " é primo");
        }
            else{
                System.out.println(v + " não é primo");
            }
        }
    }
}
