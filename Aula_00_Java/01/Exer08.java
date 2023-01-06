import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        entrada.close();
        calcImpost(a, b);
    }
    public static void calcImpost(double a, double b){
        double ab = a + b;
        if(ab <= 900){
            System.out.println("RENDA CONJUNTA: "+ab+"\nALÍQUOTA UTILIZADA: ISENTO\nIMPOSTO DE RENDA: "+ab+"\nRENDA LÍQUIDA: "+ab);
        }
        else if(ab >= 900.01 && ab < 1500.01){
            double r = ab * 0.90;
            double c = ab - r;
            System.out.println("RENDA CONJUNTA: "+ab+"\nALÍQUOTA UTILIZADA: 10%\nIMPOSTO DE RENDA: "+c+"\nRENDA LÍQUIDA: "+r);
        }
        else if(ab >= 1500.01 && ab < 2500.01){
            double r = ab * 0.85;
            double c = ab - r;
            System.out.println("RENDA CONJUNTA: "+ab+"\nALÍQUOTA UTILIZADA: 15%\nIMPOSTO DE RENDA: "+c+"\nRENDA LÍQUIDA: "+r);
        }
        else if(ab >= 2500.01){
            double r = ab * 0.75;
            double c = ab - r;
            System.out.println("RENDA CONJUNTA: "+ab+"\nALÍQUOTA UTILIZADA: 25%\nIMPOSTO DE RENDA: "+c+"\nRENDA LÍQUIDA: "+r);
        }
    }
}
