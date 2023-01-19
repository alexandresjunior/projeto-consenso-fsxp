import java.util.Scanner;

public class at11 {
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int horaInicial; 
        int horaFinal;
        int duracao;

        System.out.println("Insira o horário de início:");
        horaInicial = entrada.nextInt();

        System.out.println("Insira o horário final:");
        horaFinal = entrada.nextInt();

        if (horaInicial>horaFinal){
            duracao = 24 - (horaInicial-horaFinal);
        } else if (horaInicial<horaFinal){
            duracao = 24 - (horaFinal-horaInicial);
        }else{
            duracao = 24;
        }
        
        System.out.println("O jogo durou " + duracao + " hr(s)");

        entrada.close();
    }

}
