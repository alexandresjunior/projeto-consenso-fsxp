import java.text.DecimalFormat;
import java.util.*;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int matricula = in.nextInt();
        int horas = in.nextInt();
        double valor_hora = in.nextDouble();
        
        in.close();

        double salario = horas * valor_hora;
        
        DecimalFormat numberFormat = new DecimalFormat("#.00"); //limitando para 2 digitos após a virgula
        
        System.out.println("NÚMERO = " + matricula + "\nSALÁRIO = R$ " + numberFormat.format(salario));
    }
}
