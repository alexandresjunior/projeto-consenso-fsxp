import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] player1 = in.nextLine().split(" ");
        String[] player2 = in.nextLine().split(" ");
        
        // for(String s : player1){
        //     System.out.println(s);
        // }
        in.close();
        int s = Integer.parseInt(player1[2]) + Integer.parseInt(player2[2]);
        if(s % 2 == 0){
            if(player1[1].equals("PAR")) System.out.println(player1[0].toUpperCase());
            else System.out.println(player2[0].toUpperCase());
        }else{
            if(player1[1].equals("PAR")) System.out.println(player2[0].toUpperCase());
            else System.out.println(player1[0].toUpperCase());
        }
    }
}
