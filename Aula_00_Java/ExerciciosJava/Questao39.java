
import java.util.Scanner;;

public class Questao39 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero para a tabuada");
        int numero = entrada.nextInt();

        entrada.close();

        for(int i = 1; i <= 10;i++){
            System.out.printf("%d x %d = %d\n",numero,i,numero * i);
        }

    }

}
