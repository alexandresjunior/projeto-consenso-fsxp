
import java.util.Scanner;

public class Questao11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horaInicio, horaTermino;

        System.out.println("Digite o horario de inicio do jogo: ");
        horaInicio = entrada.nextInt();

        System.out.println("Digite a hora de termino do jogo: ");
        horaTermino = entrada.nextInt();

        if(horaInicio < horaTermino){
            System.out.println("O JOGO DUROU "+(horaTermino - horaInicio) + " HORA(S)");
        
        }else if(horaInicio == horaTermino){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        
        }else if(horaInicio > horaTermino){
            System.out.println("O JOGO DUROU "+(horaTermino - horaInicio + 24) + " HORA(S)");
        }
        
        

        entrada.close();
    }

    

}
