import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
    
        in.close();
        
        if(a >= 0 && a <= 10 && b >= 0 && b <= 10){
            double pa = 3.5;
            double pb = 7.5;
            double media = (a * pa + b * pb) / (pa + pb);
            
            DecimalFormat numberFormat = new DecimalFormat("#.00000"); //limitando para 5 digitos após a virgula
            System.out.println("MÉDIA = " + numberFormat.format(media));
        }else{
            System.out.println("A nota deve estar entre 0 a 10.");
        }
    }
}