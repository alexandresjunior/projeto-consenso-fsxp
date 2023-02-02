import java.util.Scanner;
import java.util.Arrays;
public class Questao04 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] valores = new int [3];

        for(int i = 0; i<valores.length; i++){
            System.out.println("Digite um valor ");
            valores[i] = entrada.nextInt();
        }
        
        Arrays.sort(valores);

        System.out.printf("\nMAIOR = %d\nMENOR = %d",valores[2],valores[0]);
        entrada.close();
    }

}
