
import java.util.Scanner;

public class Questao27 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int medicoes;
        double mediaMedicoes = 0;
        for(int i = 0; i < 4; i++){
            System.out.println("Digite a medição: ");
            medicoes = entrada.nextInt();

            if(medicoes < 110){
                System.out.println(medicoes +  " NORMAL");
                mediaMedicoes+= medicoes;

            }else if(medicoes >=110 && medicoes <=125){
                System.out.println(medicoes + " ALTERADA");
                mediaMedicoes+= medicoes;

            }else if(medicoes > 125){
                System.out.println(medicoes +" MUITO ALTA");
                mediaMedicoes+= medicoes;
            }
        }
        entrada.close();
        System.out.println("MEDIA DAS LEITURAS = " + (mediaMedicoes/4));

    }

}
