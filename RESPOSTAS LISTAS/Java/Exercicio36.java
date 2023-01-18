import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        in.close();

        for(int i = 0; i < num; i++){
            if(i == num-1){
                System.out.print("HO!");
            }else{
                System.out.print("HO ");
            }
        }
    }
}
