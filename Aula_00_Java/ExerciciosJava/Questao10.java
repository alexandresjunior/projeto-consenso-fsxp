
import java.util.Scanner;

public class Questao10 {
  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idadeEmDias, anos = 0,dias,meses=0;

        System.out.println("Digite sua idade em dias: ");
        idadeEmDias = entrada.nextInt();

        while(idadeEmDias >= 365){
            idadeEmDias-=365;
            anos++;
        }
        while(idadeEmDias >= 30){
            idadeEmDias-=30;
            meses++;
        }
        dias = idadeEmDias;
        System.out.printf("\n%d ano (s)\n%d mês (es)\n%d dia (s)",anos,meses,dias);

        entrada.close();
        
    }
    
} 
