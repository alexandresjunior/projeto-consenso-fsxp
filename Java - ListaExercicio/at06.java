import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class at06 {
     
    public static void main(String [] args){

        Scanner consumoMedio = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.###");
        df.setRoundingMode(RoundingMode.UP);
        
        double total = 0;
        int km = 0;
        double litros = 0;

        System.out.println("Insira o valor da distância em km:");
        km = consumoMedio.nextInt();

        System.out.println("Insira o valor da distância em km:");
        litros = consumoMedio.nextDouble();

        total = (km/litros);

        System.out.println(df.format(total) + " km/l");

        consumoMedio.close();
    }
    
}
