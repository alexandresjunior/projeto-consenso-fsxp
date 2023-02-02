
import java.util.Scanner;

public class Questao23 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int [] respostas = new int[6];

        System.out.println("Digite um valor para x: ");
        int x = entrada.nextInt();

        System.out.println("Digite um valor para y: ");
        int y = entrada.nextInt();
        entrada.close();
        
        if(x > y){
            respostas[0] = 1;
        }else{
            respostas[0]=0;
        }

        if(x == y){
            respostas[1] = 1;
        }else{
            respostas[1] = 0;
        }

        if(x < y){
            respostas[2] = 1;
        }else{
            respostas[2] = 0;
        }
        
        if(x != y){
            respostas[3] = 1;
        }else{
            respostas[3] = 0;
        }
        
        if(x >= y){
            respostas[4] = 1;
        }else{
            respostas[4] = 0;
        }

        
        if(x <= y){
            respostas[5] = 1;
        }else{
            respostas[5] = 0;
        }
        
        for(int i = 0; i < respostas.length; i++){
            System.out.println(respostas[i]);
        }

    }

}
