import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nome = in.nextLine();
        double salario = in.nextDouble();
        double vendas = in.nextDouble();

        in.close();
        
        double salario_fim = salario + vendas * 0.15;
        
        DecimalFormat df = new DecimalFormat("#.00");   //reduzindo n de casas depois da ',' pra 2
        
        System.out.println("TOTAL = " + df.format(salario_fim));


    }
}
