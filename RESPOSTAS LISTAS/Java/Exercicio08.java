import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double rh = in.nextDouble();
        double rm = in.nextDouble();

        in.close();

        double rc = rh + rm;
        double imposto;
        DecimalFormat df = new DecimalFormat("#.00");
        
        if (rc <= 900) {
            imposto = 0;
            System.out.println("RENDA CONJUNTA: " + df.format(rc) + "\nALÍQUOTA UTILIZADA: 0%" 
            + "\nIMPOSTO DE RENDA: ISENTO" + "\nRENDA LÍQUIDA: " + df.format(rc - imposto));

        } else if (rc > 2500) {
            imposto = rc * 0.25;
            System.out.println("RENDA CONJUNTA: " + df.format(rc) + "\nALÍQUOTA UTILIZADA: 25%" 
            + "\nIMPOSTO DE RENDA: " + imposto + "\nRENDA LÍQUIDA: " + df.format(rc - imposto));

        } else if (rc >= 1500.01) {
            imposto = rc * 0.15;
            System.out.println("RENDA CONJUNTA: " + rc + "\nALÍQUOTA UTILIZADA: 15%" 
            + "\nIMPOSTO DE RENDA: " + df.format(imposto)+ "\nRENDA LÍQUIDA: " + df.format(rc - imposto));

        } else if (rc >= 900.01) {
            imposto = rc * 0.10;
            System.out.println("RENDA CONJUNTA: " + rc + "\nALÍQUOTA UTILIZADA: 10%" 
            + "\nIMPOSTO DE RENDA: " + df.format(imposto) + "\nRENDA LÍQUIDA: " + df.format(rc - imposto));

        }
    }
}
