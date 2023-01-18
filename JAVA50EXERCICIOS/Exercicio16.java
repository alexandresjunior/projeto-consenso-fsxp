import java.util.Scanner;
public class Exercicio16 {
    public static void main(String[] args){
        double  popA;
        double  popB;
        int cont = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a população de A: ");
        popA = entrada.nextDouble();

       
        System.out.println("Digite a população de B: ");
        popB = entrada.nextDouble();
        
        entrada.close();


        while (popA < popB){
            popA= popA + (popA * 0.03);
            popB= popB + (popB * 0.015);
            cont = cont + 1;
        }
        System.out.println(cont + " anos");
        }
}
