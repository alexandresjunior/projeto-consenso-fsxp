
import java.util.Scanner;

public class Questao30 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] valoresA = new int[3];
        int [] valoresB = new int [3];
        
        for(int i = 0; i < valoresA.length; i++){
            System.out.println("Digite o primeiro numero: ");
            valoresA[i] = entrada.nextInt();
            
            System.out.println("Digite o primeiro numero: ");
            valoresB[i] = entrada.nextInt();
        }
        entrada.close();
        for(int x = 0; x < valoresA.length;x++){
            if(valoresA[x] > valoresB[x]){
                int soma = 0;
                for(int z = valoresB[x];z <= valoresA[x]; z++){
                    System.out.print(z + " ");
                    soma += z ;
                }
                System.out.println("Soma = " + soma);

            }else{
                int soma = 0;
                for(int z = valoresA[x];z <= valoresB[x]; z++){
                    System.out.print(z + " ");
                    soma += z ;
                }
                System.out.println("Soma = " + soma);

            }
        }
        
    }

}
