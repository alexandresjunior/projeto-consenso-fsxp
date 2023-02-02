
import java.util.Scanner;

public class Questao46 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de m:");
        int m = entrada.nextInt();

        System.out.println("Digite o valor de n");
        int n = entrada.nextInt();

        entrada.close();

        int fan=n,fam=m;
        
        if(fan == 0){
            fan=1;
        }else{
            for(int i = n; i>1;i--){
            fan *=(i-1);
            }
        }
        
        if(fam == 0){
            fam = 0;
        }else{
            for(int i = m; i>1;i--){
                fam *=(i-1);
                }
        }

        
        System.out.println(fan+fam);
    }

}
