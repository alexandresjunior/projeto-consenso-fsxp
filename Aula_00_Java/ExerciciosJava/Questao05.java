import java.util.Scanner;
import java.util.Arrays;

public class Questao05 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int [] numeros = new int [3];

        for(int i = 0; i < numeros.length; i++){
            System.out.println("digite um numero: ");
            numeros[i] = entrada.nextInt();
        }
        Arrays.sort(numeros);

        for(int x = 0; x < numeros.length; x++){
            System.out.println(numeros[x]);
        }

        entrada.close();
    }

}
