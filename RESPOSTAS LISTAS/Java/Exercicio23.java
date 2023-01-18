import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt(), y = in.nextInt();

        System.out.println(x > y ? "1":"0");
        System.out.println(x == y ? "1":"0");
        System.out.println(x < y ? "1":"0");
        System.out.println(x != y ? "1":"0");
        System.out.println(x >= y ? "1":"0");
        System.out.println(x <= y ? "1":"0");
        
    }
}
