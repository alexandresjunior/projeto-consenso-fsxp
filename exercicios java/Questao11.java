import java.util.Scanner;
public class Questao11 {
    /*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma
duração mínima de 1 hora e máxima de 24 horas */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a hora inicial:");
        int horaI = entrada.nextInt();

        System.out.println("Insira a hora final:");
        int horaF = entrada.nextInt();

        if( horaI > horaF){
            System.out.println("O jogo durou: " + (24 - (horaI - horaF)) +" Hora(s)");
        }else if (horaI < horaF){
            System.out.println("O jogo durou " + (horaF - horaI)+ " Hora(s)");
        }else{
            System.out.println("O jogo durou 24 horas");
        }
    }
}
