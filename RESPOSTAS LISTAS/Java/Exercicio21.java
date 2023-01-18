import java.util.Arrays;
import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] anos = new int[3];
        int[] velo = new int[3];
        
        for(int i = 0; i < 3; i++){
            String[] entrada = in.nextLine().split(" ");
            anos[i] = Integer.parseInt(entrada[0]);
            velo[i] = Integer.parseInt(entrada[1]);
        }
        in.close();
        
        Arrays.sort(anos);
        Arrays.sort(velo);

        System.out.println(
        "Ano do carro mais novo = " + anos[2] + 
        "\nVelocidade do mais rápido = " + velo[2]
        );
    }
}
