import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args){
        int num1 = 0, num2 = 1; 
        int n;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número de 1 até 46: ");
        n = entrada.nextInt();

        entrada.close();
        System.out.print("\n"+num1+" ");
        
        for(int i = 0; i < n-1; i++){
           if (n>46){
            break;
           }
           else{
        
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.print(num1+ " ");
            
        }
        
    }
    }
}