import java.util.Scanner;

public class Questao08 {
    /*Elabore um programa que permita calcular o Imposto de Renda (IR) de um casal
a partir das rendas do Homem (RH) e da Mulher (RM). O imposto é calculado sobre
a renda conjunta (RC=RH+RM) */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double RH, RM, RC, IR, RL;

        System.out.println("Insira a renda do homem:");
        RH = entrada.nextDouble();

        System.out.println("Insira a renda da mulher");
        RM = entrada.nextDouble();

        RC = RH + RM;
        System.out.println("A renda conjunta é: "+RC);
        
        
        
        if(RC <= 900){
            System.out.println("Está isento");
        }else if (RC >900 && RC <= 1500){
            System.out.println("Aliquota utilizada: 10%");
            IR = (RC * 10) /100; 
            RL = RC - IR;
            System.out.println("Imposto de renda: " + IR + "Renda líquida: "+RL);
        }else if (RC >1500 && RC <=2500){
            System.out.println("Aliquota utilizada: 15%");
            IR = (RC * 15) / 100; 
            RL = RC - IR;
            System.out.println("Imposto de renda: " + IR + "Renda líquida: "+RL);
        }else{
            System.out.println("Aliquota utilizada: 25%");
            IR = (RC * 25) / 100;
            RL = RC - IR;
            System.out.println("Imposto de renda: " + IR + "Renda líquida: "+RL);
        }
            
    }
}
