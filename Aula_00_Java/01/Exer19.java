import java.util.Scanner;

public class Exer19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        entrada.close();
        double valor = calcAumento(a);
        System.out.printf("%.2f %n",valor);
    }
    public static double calcAumento(double a){
        double x;
        if(a >= 300 && a < 500){
            x = a + a*0.07;
        }
        else if(a >= 500){
            x = a + a*0.10;
        }
        else{
            x = a + a*0.05;
        }
        return x;
    }
}
