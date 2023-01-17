
import java.util.Scanner;

public class Questao25 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a avaliação do traalho: ");
        Integer avaliacao = entrada.nextInt();
        int contador = 0;
        entrada.close();

        String valores = avaliacao.toString();
        for(int i = 0; i < valores.length(); i++ ){
            if(valores.charAt(i) == '1'){
                contador++;
            }
        }
        if(contador >= 4){
            System.out.println("AVALIADO");
        }else{
            System.out.println("0 (ZERO)");
        }

    }
    
}
