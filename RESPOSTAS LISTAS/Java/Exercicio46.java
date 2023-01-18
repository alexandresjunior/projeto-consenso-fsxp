import java.util.Scanner;

public class Exercicio46 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long soma_total = 0;
        while(true){
            for(int i = 0; i < 2; i++){
                long fat = 1;
                long x = in.nextLong();
                if(x >= 0 && x <= 20){
                    for(int j = 1; j <= x; j++){
                        fat *= j;
                    }
                }
                soma_total += fat;
            }
            System.out.println(soma_total);
            soma_total = 0;
            in.close();
        }
    }    
}
