import java.util.Scanner;

public class Exer49 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, p, imc;
        p = entrada.nextDouble();
        a = entrada.nextDouble();
        entrada.close();

        imc=p/(a*2);

        if (imc<20){
            System.out.println(imc + " Abaixo do peso");
        }            
        else if (imc>=20 && imc<25){
            System.out.println(imc + " Peso normal");
        }
        else if (imc>=25 && imc<30){
            System.out.println(imc + " Sobre Peso");
        }
        else if (imc>30 && imc<=40){
            System.out.println(imc + " Obeso");
        }
        else if (imc>40){
            System.out.println(imc + " Obeso Mórbido");
        }
    }
}
