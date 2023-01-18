import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int hora_ini = in.nextInt();
        int hora_fim = in.nextInt();

        in.close();
        
        if(hora_fim < hora_ini){
            System.out.println("O JOGO DUROU " + (24 - hora_ini + hora_fim) + " HORA(S)");
        }else if(hora_fim > hora_ini){
            System.out.println("O JOGO DUROU "+ (hora_fim-hora_ini) + " HORA(S)");
        }else{
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
    }
}
