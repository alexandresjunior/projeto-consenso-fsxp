package treinaRecife;
import java.util.Scanner;


public class Exercicio09 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a duraçao do evento em segundos");
        int duration = sc.nextInt();
        
        int hours = duration / 3600;
        int minutes = (duration % 3600) / 60;
        int seconds = (duration % 3600) % 60;
        sc.close();
        
        System.out.println("HH:MM:SS = " + hours+":"+ minutes+":" + seconds);
    }



}
