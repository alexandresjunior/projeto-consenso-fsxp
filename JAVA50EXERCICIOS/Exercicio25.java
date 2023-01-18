import java.util.Scanner;
public class Exercicio25 {
    public static void main ( String args [] ){
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite 0 se o trabalho possui tal requisito ou 1 se não possui: ");
        num1= entrada.nextInt();
        if ((num1 != 0) && (num1 != 1)){
            System.out.print("INVÁLIDO! Digite 0 se o trabalho possui tal requisito ou 1 se não possui: ");
            num1= entrada.nextInt();
        }
        System.out.print("Digite 0 se o trabalho possui tal requisito ou 1 se não possui: ");
        num2= entrada.nextInt();
        if ((num2 != 0) && (num2 != 1)){
            System.out.print("INVÁLIDO! Digite 0 se o trabalho possui tal requisito ou 1 se não possui: ");
            num2= entrada.nextInt();
        }
        System.out.print("Digite 0 se o trabalho possui tal requisito ou 1 se não possui: ");
        num3= entrada.nextInt();
        if ((num3 != 0) && (num3 != 1)){
            System.out.print("INVÁLIDO! Digite 0 se o trabalho possui tal requisito ou 1 se não possui: ");
            num3= entrada.nextInt();
        }
        System.out.print("Digite 0 se o trabalho possui tal requisito ou 1 se não possui: ");
        num4= entrada.nextInt();
        if ((num4 != 0) && (num4 != 1)){
            System.out.print("INVÁLIDO! Digite 0 se o trabalho possui tal requisito ou 1 se não possui: ");
            num4= entrada.nextInt();
        }
        System.out.print("Digite 0 se o trabalho possui tal requisito ou 1 se não possui: ");
        num5= entrada.nextInt();
        if ((num5 != 0) && (num5 != 1)){
            System.out.print("INVÁLIDO! Digite 0 se o trabalho possui tal requisito ou 1 se não possui: ");
            num5= entrada.nextInt();
        }


        if ((num1 == 0) && (num2 == 0)){
            System.out.println("ZERO");
        }
        else if ((num3 == 0) && (num4 == 0)){
            System.out.println("ZERO");
        }
        else if (num5 == 0){
            System.out.println("ZERO");
        }
        else{
            System.out.println("AVALIADO");
        }
        entrada.close();
}
}