import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();
        entrada.close();
        int count = 0;

        for(int i = x; count < 6; i++){
            if(i % 2 == 1){
                System.out.println(i);
                count++;
            }
        }
    }
}
