import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);   
        
        int numero_testes = in.nextInt(); //na lista o numero de testes também gera output, mas assumi que foi um equívoco
        
        for(int i = 0; i < numero_testes; i++){ 
            int numero = in.nextInt();
            int n_divisoes = 0;
            
            if(numero == 0 || numero == 1){
                System.out.println(numero + " não é primo");
            }else{
                for(int j = 2; j < numero; j++){
                    if(numero % j == 0){        //é divisivel
                        n_divisoes++;
                    }
                }
            }
            if(n_divisoes == 0){
                System.out.println(numero + " é primo");
            }else{
                System.out.println(numero + " não é primo");
            }
        }
        in.close();
    }
}


