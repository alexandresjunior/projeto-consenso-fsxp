
import java.util.Scanner;

public class Questao18 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um numero para inverter: ");
        Integer numero = entrada.nextInt();
        String numeroInverter = numero.toString();
        
        for(int i = numeroInverter.length();i != 0; i--){
            System.out.print(numeroInverter.charAt(i-1));
        }

        entrada.close();
    }

}
