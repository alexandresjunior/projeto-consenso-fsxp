
import java.util.Scanner;

public class Questao33 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = entrada.nextInt(),contador = 0,sequencia = 1;
        entrada.close();

        for(int i = 0; i < n; i++){
            for(int y = 0; y < 4; y++){
            if(contador == 3){
                System.out.print("PUM\n");
                contador = 0;
                sequencia ++;
                
            }else{
            System.out.print(sequencia + " ");
            sequencia++;
            contador++;}
            }
        }

        
    }

}
