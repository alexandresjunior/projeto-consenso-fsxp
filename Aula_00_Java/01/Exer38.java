import java.util.Scanner;

public class Exer38 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        entrada.close();
        if(a == 3){
            System.out.println("É PRIMO");
        }
        else if(a % 3 > 0 && a % 3 > 0){
            System.out.println("É PRIMO");
        }
        else if(a % 3 == 0 || a % 2 == 0){
            System.out.println("NÃO É PRIMO");
        }
    }
}
