import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        int x = in.nextInt();
        double y = in.nextDouble();

        in.close();

        double comb_gasto = x / y;

        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println(df.format(comb_gasto) + " km/l");
        
   }
}