import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#00");
        
        int segundos = in.nextInt();

        int minutos = 0;
        int horas = 0;

        while (segundos >= 60) {
            if (segundos >= 3600) {
                horas++;
                segundos = segundos - 3600;
            } else if (segundos >= 60) {
                minutos++;
                segundos = segundos - 60;
            }
        }
        System.out.println("HH:MM:SS = " + df.format(horas) + ":" + df.format(minutos) + ":" + df.format(segundos));
    }
}
