import java.util.Scanner;
public class Questao22 {
    /*a Escreva um programa que,dado o consumo de em m3, calcula o valor da conta de água daquela residência. */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int v = 0;
        int a = 0;
        
        System.out.println("Insira o consumo de água:");
         a = entrada.nextInt();
        
        if( a <= 10){
            v = 7;
        }else if (a >= 11 && a <= 30){
            v = 7 + (a - (10*1));
            
        }else if (a >= 31 && a <= 100){
            v = 7 + (a - 10)*1 + (a - 30)*2;
            
        }else{
            v = 7 + (a - 10)*1+ (a - 30)*2 + (a - 100)*3;
            
        }System.out.println("Valor em reais: "+ v );
    }
}