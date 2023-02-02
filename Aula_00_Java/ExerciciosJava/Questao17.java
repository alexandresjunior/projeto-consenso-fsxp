
import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        boolean eprimo = true;
        System.out.println("digite um numero para verificação: ");
        numero = entrada.nextInt();

        for(int i = 2; i < numero; i++){

            if(numero % i == 0){
                eprimo = false;
                break;
            }
        }
            if(eprimo == true){
            System.out.println(numero + " é primo");
            }else{
                System.out.println(numero + " não é primo");
        }
        


        entrada.close();
    }
}
