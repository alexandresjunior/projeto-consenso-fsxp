
import java.util.Scanner;

public class Questao24 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite um numero para saber se ele é palindromo: ");
        Integer numero = entrada.nextInt();
        
        entrada.close();

        String numeroInvertido = "",numeroNormal = numero.toString();

        for(int i = numeroNormal.length()-1; i >= 0;i--){
            numeroInvertido += numeroNormal.charAt(i);
        }

        if(numeroInvertido.equals(numeroNormal)){
            System.out.println("S");
        }else{
            System.out.println("N");
        }
    }    
}

