import java.util.Scanner;

public class at17 {
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int n;  /*(1<numero<=100);*/
        int x;
        int cont = 0;

        System.out.println("Insira o numero N: ");
        n = entrada.nextInt();


        for(int i = 0; i < n; i++){
            cont = 0;
            System.out.println("Digite os valores: ");
            x = entrada.nextInt();
            for(int j = 0; j < x; j++){
                if(x % j == 0)
                    cont++;
            }
            if(cont == 0)
             System.out.println(x + "é primo");
            else
             System.out.println(x + "não é primo");    
        }
        entrada.close();
    }
}
