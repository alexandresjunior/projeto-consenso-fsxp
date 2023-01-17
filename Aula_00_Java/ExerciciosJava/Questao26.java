
import java.util.Scanner;

public class Questao26 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int brinquedos = 0;
        System.out.println("Digite altura do usuario: ");
        double altura = entrada.nextDouble();

        System.out.println("Digite a idade do usuario: ");
        int idade = entrada.nextInt();

        entrada.close();

        if(altura >= 1.5 && idade >= 12){
            brinquedos++;
        }
        if(altura >= 1.4 && idade >= 14){
            brinquedos++;
        }
        
        if(altura >= 1.7 && idade >= 16){
            brinquedos++;
        }

        System.out.println(brinquedos);
    }

}
