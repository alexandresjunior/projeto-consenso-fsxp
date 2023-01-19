import java.util.Scanner;

public class at23 {
    

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int x, y;


        System.out.println("Insira o valor de x: ");
        x = entrada.nextInt();

        System.out.println("Insira o valor de y: ");
        y = entrada.nextInt();

        if(x > y){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

        if (x == y) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        if (x < y) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        if (x != y) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        if (x >= y) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        if (x <= y) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        entrada.close();
}
}