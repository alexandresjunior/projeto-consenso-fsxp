
import java.util.Scanner;

public class Questao36 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero sorteado: ");
        int ho = entrada.nextInt(),contador = 0;

        entrada.close();

        for(int i = 0; i < ho; i++){
            if(contador == (ho-1)){
                System.out.println("HO!");
                break;
            }
            System.out.print("HO ");
            contador++;
        }

    }

}
