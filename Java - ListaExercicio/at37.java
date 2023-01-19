import java.util.Scanner;

public class at37 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int x, y;
        String j1, j2, e1;

        System.out.println("Nome do 1º jogador:");
        j1 = entrada.next();
        System.out.println("Escolha do 1º jogador:");
        e1 = entrada.next();
        System.out.println("Número escolhido pelo 1º jogador:");
        x = entrada.nextInt();
        System.out.println("Nome do 2° jogador:");
        j2 = entrada.next();
        System.out.println("Escolha do 2° jogador:");
        System.out.println("Número escolhido pelo 2° jogador:");
        y = entrada.nextInt();

        if ((x + y) % 2 == 0) {
            if (e1.equals("par"))
                System.out.println(j1);
        } else {
            System.out.println(j2);
        }

        if (x + y % 2 != 0) {
            if (e1.equals("impar"))
                System.out.println(j1);
        } else {
            System.out.println(j2);
        }
        entrada.close();
    }

}
