import java.util.Scanner;
public class Exercicio26 {
    public static void main ( String args [] ){
        float A;
        int I;
        int total = 0;


        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a altura: ");
        A = entrada.nextFloat();

        System.out.print("Digite a idade: ");
        I = entrada.nextInt();

        if ((A>=1.4) && (I>=14))
            total = total + 1;
            
        if ((A >= 1.5) && (I >= 12))
            total = total + 1;

        if ((A >= 1.7) || (I >= 16))
            total = total + 1;

        entrada.close();
        System.out.println(total);
        
    }
}
