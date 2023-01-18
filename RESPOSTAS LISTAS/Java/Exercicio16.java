import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        
        
        double pop_a = in.nextDouble();
        double pop_b = in.nextDouble();
        int cont = 0;

        in.close();
        
        while(pop_a < pop_b){
            pop_a = pop_a + pop_a*0.03;
            pop_b = pop_b + pop_b*0.015;
            cont++;
        }
        System.out.println(cont + " anos");
    }
}
