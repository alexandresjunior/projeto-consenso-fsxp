import java.util.Scanner;

public class Exer16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double p1 = entrada.nextDouble();
        double p2 = entrada.nextDouble();
        entrada.close();
        int c = 0;
        for(int i = 0; p1 < p2; i++){
            p1 = p1 + (p1*0.03);
            p2 = p2 + (p2*0.015);
            c++;
        }
        System.out.println(c+" anos");
    }
}
