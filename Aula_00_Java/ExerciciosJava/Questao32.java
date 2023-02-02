
import java.util.Scanner;

public class Questao32 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int alcool = 0, gasolina = 0, diesel = 0;
        float alcoolQ = 0, gasolinaQ = 0, dieselQ = 0;

        for(int i = 0; i < 5;i++){    
            System.out.println("Qual combustivel você deseja: [1]Alcool [2]Gasolina [3] Diesel ");
            String pergunta = entrada.next();

            switch(pergunta.toLowerCase()){
                case "1":
                    alcool++;
                    System.out.println("Quantos Litros de Álcool você deseja? ");
                    alcoolQ+= entrada.nextFloat();
                    break;
                case "2":
                    gasolina++;
                    System.out.println("Quantos Litros de gasolina você deseja? ");
                    gasolinaQ+= entrada.nextFloat();
                    break;
                case "3":
                    diesel++;
                    System.out.println("Quantos Litros de Diesel você deseja? ");
                    dieselQ+= entrada.nextFloat();
            }   
        }
        entrada.close();

        System.out.printf("\n1. Álcool: %d -Qtd Litros: %.1f\n",alcool,alcoolQ);
        System.out.printf("Gasolina: %d -Qtd Litros: %.1f\n",gasolina,gasolinaQ);
        System.out.printf("Diesel: %d -Qtd Litros: %.1f\n",diesel,dieselQ);

    }

}
