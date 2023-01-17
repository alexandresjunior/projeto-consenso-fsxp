import java.util.Scanner;

public class Questao08 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double ir,rh,rm,rc;

        System.out.println("Digite a renda do homem: ");
        rh = entrada.nextDouble();

        System.out.println("Digite a renda da mulher: ");
        rm = entrada.nextDouble();

        rc = rh+rm;
        
        if(rc <= 900){
            System.out.println("RENDA CONJUNTA: "+ rc+
            "\nALIQUOTA UTILIZADA: isento" + "\nIMPOSTO DE RENDA: isento" +
            "\nRENDA LIQUIDA: " + rc);

        }else if( rc > 900 &&  rc <= 1500){
            ir = rc * 0.1 ;
            System.out.println("RENDA CONJUNTA: "+ rc+
            "\nALIQUOTA UTILIZADA: 10%" + "\nIMPOSTO DE RENDA: " + ir +
            "\nRENDA LIQUIDA: " + (rc-ir));

        }else if( rc > 1500 &&  rc <= 2500){
            ir = rc * 0.15 ;
            System.out.println("RENDA CONJUNTA: "+ rc+
            "\nALIQUOTA UTILIZADA: 15%" + "\nIMPOSTO DE RENDA: " + ir +
            "\nRENDA LIQUIDA: " + (rc-ir));

        }else{
            ir = rc * 0.25 ;
            System.out.println("RENDA CONJUNTA: "+ rc+
            "\nALIQUOTA UTILIZADA: 25%" + "\nIMPOSTO DE RENDA: " + ir +
            "\nRENDA LIQUIDA: " + (rc-ir));
        }

        entrada.close();



    }
}
