import java.util.Scanner;

public class at09 {
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int segundos;
        int minutos;
        int horas;
        int segundo;
        int resto;

        System.out.println("Insira a duração do evento:");
        segundos = entrada.nextInt(); 

        horas = segundos/3600;
        resto = segundos % 3600;
        minutos = resto/60;
        segundo = resto % 60;


        System.out.println("HH:MM:SS = " + horas + ":"+ minutos + ":" + segundo);

        entrada.close();
    }

}
