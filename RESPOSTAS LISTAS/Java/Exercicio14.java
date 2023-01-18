import java.util.*;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int contimp = 0;

        while(contimp < 6){
            if(n % 2 != 0) {
                System.out.println(n);
                contimp++;
            }
            n++;
        }
        
    }
}
