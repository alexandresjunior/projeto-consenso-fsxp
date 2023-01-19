import java.util.Scanner;

public class at27 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int medicao =0;
        int soma = 0;
        double media;

        for(int i=0; i<4; i++){
            System.out.println("Insira o " + (i+1) + " valor da medição:");
            medicao = entrada.nextInt();
        }
    
        
        if(medicao<110){
            System.out.println(medicao + "Normal");
            soma += medicao;
        } else if(medicao >=100 && medicao<= 125){
            System.out.println(medicao + "Alterada");
            soma += medicao;
        } else{
            System.out.println(medicao + "Muito alta");
            soma += medicao;
        }

        media = (soma/4);
        System.out.println("Média:" + medicao);

        entrada.close();
    }
}
