
import java.util.Scanner;

public class Questao16 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double paisA,paisB,crescimentoB;
        int contadorAnos = 1;

        System.out.println("Digite a população do pais A: ");
        paisA = entrada.nextDouble();

        System.out.println("Digite a população do pais B: ");
        paisB = entrada.nextDouble();
        crescimentoB = paisB;
        
        while(crescimentoB<=paisA){
            crescimentoB = crescimentoB + (crescimentoB * 0.015);
            contadorAnos++;
        }
        System.out.println(contadorAnos + " anos");


        entrada.close();

    }

}
