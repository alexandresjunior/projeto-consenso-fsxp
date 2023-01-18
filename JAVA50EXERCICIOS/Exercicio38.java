import java.util.Scanner;
public class Exercicio38 {
    public static void main(String[] args) {
        int num;
        int cont = 0;


        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um número: ");
        num = entrada.nextInt();

        for(int i =1; i<= num; i++){
            if ( num % i == 0){
                cont = cont + 1;
            }
        }
        if (cont == 2){
            System.out.println("é primo ");
        }
        else{
            System.out.println("não é primo ");
        }
        entrada.close();




    }
    
}
