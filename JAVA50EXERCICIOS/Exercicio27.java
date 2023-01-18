import java.util.Scanner;
public class Exercicio27 {
    public static void main ( String args [] ){
        int med1;
        int med2;
        int med3;
        int med4;
        double media = 0.00;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a medição atual: ");
        med1 = entrada.nextInt();
        System.out.print("Digite a medição atual: ");
        med2 = entrada.nextInt();
        System.out.print("Digite a medição atual: ");
        med3 = entrada.nextInt();
        System.out.print("Digite a medição atual: ");
        med4 = entrada.nextInt();



        if (med1 < 110){
            System.out.println(med1 + " NORMAL");
        }
        else if ((med1 >= 110) && (med1 <125)){
            System.out.println(med1 + " ALTERADA");
        }
        else{
            System.out.println(med1 + " MUITO ALTA");
        }
        if (med2 < 110){
            System.out.println(med2 + " NORMAL");
        }
        else if ((med2 >= 110) && (med2 <125)){
            System.out.println(med2 + " ALTERADA");
        }
        else{
            System.out.println(med2 + " MUITO ALTA");
        }
        if (med3 < 110){
            System.out.println(med3 + " NORMAL");
        }
        else if ((med3 >= 110) && (med3 <125)){
            System.out.println(med3 + " ALTERADA");
        }
        else{
            System.out.println(med3 + " MUITO ALTA");
        }
        if (med4 < 110){
            System.out.println(med4 + " NORMAL");
        }
        else if ((med4 >= 110) && (med4 <125)){
            System.out.println(med4 + " ALTERADA");
        }
        else{
            System.out.println(med4 + " MUITO ALTA");
        }
        entrada.close();

        media = media + (med1 + med2 + med3 + med4);
        media = media/4;

        System.out.printf("MÉDIA DAS LEITURAS = %.2f" , media);


}
}