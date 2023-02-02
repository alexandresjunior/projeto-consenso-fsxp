
import java.util.Scanner;

public class Questao41 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite a sua altura: ");
        double altura = entrada.nextDouble();

        System.out.println("Digite o seu peso: ");
        double peso = entrada.nextDouble();

        entrada.close();

        if(altura <= 1.5 && peso == 50){
            System.out.println("parabéns peso ideal");

        }else if(peso > 50 && altura <= 1.5){
            System.out.println("EMAGREÇA "+ (peso-50));

        }else if (peso < 50 && altura <= 1.5){
            System.out.println("ENGORDE: "+ (50 - peso));

        }else if(altura > 1.5 && altura <= 1.9 && peso == 70){
            System.out.println("parabéns peso ideal");

        }else if(peso> 70 && altura > 1.5 && altura <= 1.9){
            System.out.println("EMAGREÇA: "+ (peso-70));

        }else if( peso < 70 && altura > 1.5 && altura <= 1.9){
            System.out.println("ENGORDE: " + (70-peso));

        }else if(altura > 1.9 && peso == 100){
            System.out.println("parabéns peso ideal");
        }else if(peso> 100 && altura > 1.9){
            System.out.println("EMAGREÇA: "+ (peso-100));
        }else if(altura > 1.9 && peso < 100){
            System.out.println("ENGORDE: " + (100-peso));
        }


    }
    
}
