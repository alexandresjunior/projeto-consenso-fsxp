import java.util.Scanner;

public class at14 {
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int x;
        int i = 0;

        System.out.println("Insira um valor:");
        x = entrada.nextInt();

        while (i < 6){
            if(x % 2 == 1){
                System.out.println(x);
                i++;
            }
            x++;
        }
        entrada.close();
    }
}