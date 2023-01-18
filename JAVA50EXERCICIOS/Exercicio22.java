import java.util.Scanner;
public class Exercicio22 {
    public static void main ( String args [] ){
        int consumo;
        double assinatura = 7.00;
        double valor11a30 = 20.00;
        double valor31a100 = 140.00;
      
        double total;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o consumo de água em metros cúbicos: ");
        consumo = entrada.nextInt();

        if (consumo <= 10){
            System.out.println("Valor em reais = " + assinatura);
        }
        else if ((consumo > 10) && (consumo <= 30 )){
            total = assinatura + ((consumo-10) * 1);
            System.out.println("Valor em reais = " + total);
        }
        else if ((consumo > 30) && (consumo <= 100)){
            total = assinatura + valor11a30 + ((consumo - 31) * 2);
            System.out.println("Valor em reais = " + total);
        }
        else{
            total= assinatura + valor11a30 + valor31a100 + ((consumo - 100) * 5);
            System.out.println("Valor em reais = " + total);
        }

        entrada.close();
}
}