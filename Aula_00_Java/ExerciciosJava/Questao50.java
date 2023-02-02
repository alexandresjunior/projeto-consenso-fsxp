
import java.util.Scanner;

public class Questao50 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o andar: ");
        int contador = entrada.nextInt();
        entrada.close();

        Integer andar = 0;

        for(int i = 0; i < contador; i++){
            andar++;
            while(andar.toString().contains("13")){
                andar++;
            }
            while(andar.toString().contains("4")){
                andar++;
            }
        }

        System.out.println(andar);

             

    }  

}
