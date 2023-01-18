import java.util.Scanner;
public class Exercicio23 {
    public static void main ( String args [] ){
        int x;
        int y;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número : ");
        x = entrada.nextInt();

        System.out.println("Digite um número : ");
        y = entrada.nextInt();

        if (x>y) {
            System.out.println("\n1");
        }
        else if (x<=y){
            System.out.println("\n0");
        }
        
        if (x==y) {
            System.out.println("1");
        }
        else if (x!=y){
            System.out.println("0");
        }
        if (x<y) {
            System.out.println("1");
        }
        else if (x>=y){
            System.out.println("0");
            }

        if (x!=y) {
            System.out.println("1");
        }
        else if (x==y){
                System.out.println("0");
            }
        if (x>=y) {
            System.out.println("1");
        }
        else if (x<y){
            System.out.println("0");
        }

        if (x<=y) {
            System.out.println("1");
        }
        else if (x>y){
            System.out.println("0");
        }
        entrada.close();


    }
}
