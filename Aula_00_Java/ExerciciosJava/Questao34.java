
import java.util.Scanner;

public class Questao34 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;

        System.out.println("Digite o inicio da sequencia: ");
        int x = entrada.nextInt();

        System.out.println("Digite o fim da sequencia: ");
        int y = entrada.nextInt();
        
        entrada.close();

        for(int i = 1; i <= y; i++){
            if(contador == x){
                System.out.print("\n");
                contador = 0;
            }
            System.out.print(i + " ");
            contador++;
            

        }
    
    }

}
