import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double peso = in.nextDouble();
        double altura = in.nextDouble();
        double imc = peso/(altura*altura);
        in.close();
        DecimalFormat nf = new DecimalFormat("#.00000000"); //limitando para 5 digitos após a virgula

        
        if(imc > 40) System.out.println("IMC = " + imc + " - Obeso Mórbido");
        else if(imc >= 30) System.out.println("IMC = " + nf.format(imc) + " - Obeso");
        else if(imc >= 25) System.out.println("IMC = " + nf.format(imc) + " - Sobrepeso");
        else if (imc >= 20) System.out.println("IMC = " + nf.format(imc) + " - Peso Normal");
        else System.out.println("IMC = " + nf.format(imc) + " - Abaixo do peso");
    }
}
