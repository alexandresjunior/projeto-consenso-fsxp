import java.util.Scanner;
public class Exercicio17 {
    
		public static void main(String[] args) {
            int n, primo=0;
    
            Scanner entrada = new Scanner(System.in);
            System.out.print("Escolha um número: ");
            n= entrada.nextInt();
           
            for (int j=1; j<=n; j++) {
                    if (n % j == 0) {
                        primo++;
                    }
                }
                if (primo == 2) {
                    System.out.println( n + " é PRIMO!");
                }
                else {
                    System.out.println( n + " não é PRIMO!" );
                }
                entrada.close();
                
            }
    
            
        }