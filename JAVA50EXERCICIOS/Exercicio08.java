import java.util.Scanner;
public class Exercicio08 {
    public static void main (String[]args) {
    double RH;
    double RM;
    double RC;

    Scanner entrada = new Scanner(System.in) ;
	System.out.println("Digite o valor da renda do homem: " );
    RH = entrada.nextDouble();
	System.out.println("Digite o valor da renda da mulher: " );
    RM = entrada.nextDouble();

    RC = (RH + RM);

    if (RC <= 900) {
        System.out.println("RENDA CONJUNTA = " + RC);
        System.out.println("ALÍQUOTA UTILIZADA = Insento");
        System.out.println("IMPOSTO DE RENDA = " + 0);
        System.out.println("RENDA LÍQUIDA = " + RC);
    }

    else if (1500 >= RC)  {
        System.out.println("RENDA CONJUNTA = " + RC);
        System.out.println("ALÍQUOTA UTILIZADA = " + "10%");
        System.out.println("IMPOSTO DE RENDA = " + ((10*RC)/100));
        System.out.println("RENDA LÍQUIDA = " + (RC - ((10*RC)/100)));
    }
    else if (2500 >= RC) {
        System.out.println("RENDA CONJUNTA = " + RC);
        System.out.println("ALÍQUOTA UTILIZADA = " + "15%");
        System.out.println("IMPOSTO DE RENDA = " + ((15*RC)/100));
        System.out.println("RENDA LÍQUIDA = " + (RC - ((15*RC)/100)));
    }
    else if (RC > 2500){
        System.out.println("RENDA CONJUNTA = " + RC);
        System.out.println("ALÍQUOTA UTILIZADA = " + "25%");
        System.out.println("IMPOSTO DE RENDA = " + ((25*RC)/100));
        System.out.println("RENDA LÍQUIDA = " + (RC - ((25*RC)/100)));
    }
    entrada.close();
}
}