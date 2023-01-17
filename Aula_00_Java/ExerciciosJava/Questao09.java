
import java.util.Scanner;

public class Questao09 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor,horas = 0,minutos = 0 ,segundosFinais = 0;

        System.out.println("Digite os segundos: ");
        valor = entrada.nextInt();

        valor = valor / 60;

        while(valor >= 60){
            valor-=60;
            horas++;
        }
        minutos = valor;
        System.out.println("HH:MM:SS = " + horas + ":" + minutos + ":" + segundosFinais);

        entrada.close();
    }

}
