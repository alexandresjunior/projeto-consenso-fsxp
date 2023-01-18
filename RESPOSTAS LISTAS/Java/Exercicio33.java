import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.close();
        int entrada = in.nextInt();
        int cont = 0;
        for(int i = 0; i < entrada; i++){
            
            System.out.println((cont+1) + " " + (cont+2) + " " + (cont+3) + " PUM");
            cont+= 4;
        }

    }
}
