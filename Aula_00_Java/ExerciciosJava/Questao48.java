
import java.util.Scanner;

public class Questao48 {
    
    public static void main(String[] args) {
     
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int idade = entrada.nextInt();

        System.out.println("Digite o peso");
        float peso = entrada.nextFloat();

        entrada.close();

        final int gota = 25;
        int dosagem = 0;

        if(idade >= 12 && peso>60){
            dosagem = 2;
            System.out.println(dosagem * 20 + " gotas");
        }else if(idade >= 12 && peso < 60){
            dosagem = 875/gota;
            System.out.println(dosagem + " gotas");

        }else if(idade < 12 && peso > 30){
            dosagem = 750/gota;
            System.out.println(dosagem + " gotas");

        }else if(idade < 12 && peso > 9 && peso < 16){
            dosagem = 250/gota;
            System.out.println(dosagem + " gotas");
            
        }else if(idade < 12 && peso > 16 && peso < 24){
            dosagem = 375/gota;
            System.out.println(dosagem + " gotas");
            
        }else if(idade < 12 && peso > 24 && peso < 30){
            dosagem = 500/gota;
            System.out.println(dosagem + " gotas");
            
        }

        

    }

}
