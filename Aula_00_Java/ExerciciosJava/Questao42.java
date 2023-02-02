
import java.util.Scanner;

public class Questao42 {
 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double divisao;

        System.out.println("Digite o valor antigo do ingresso: ");
        int vantigo = entrada.nextInt();

        System.out.println("Digite o novo valor do ingresso: ");
        int nvalor = entrada.nextInt();

        entrada.close();

        if(vantigo == nvalor){
            System.out.println("0%");
        }else if( (nvalor - vantigo) == vantigo){
            System.out.println("100%");
        }else{
            double [] porcentagens = {0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9};
            for(int i = 1; i< porcentagens.length; i++){
                
                divisao = vantigo * porcentagens[i];

                if(divisao == (nvalor - vantigo)){
                    System.out.println((porcentagens[i] * 100) + "%");
                }
            }

        }
    }

}
