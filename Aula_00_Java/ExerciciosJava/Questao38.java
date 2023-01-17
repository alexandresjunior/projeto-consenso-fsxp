
import java.util.Scanner;

public class Questao38 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero para verificar: ");
        int numero = entrada.nextInt();
        entrada.close();

        boolean eprimo = true;
        for(int i = 2; i < numero; i++){
            if( numero % i == 0){
                System.out.println("NÃO É PRIMO");
                eprimo = false;
                break;
            }
        }

        if(eprimo == true){
            System.out.println("É PRIMO");
        }
    }

}
