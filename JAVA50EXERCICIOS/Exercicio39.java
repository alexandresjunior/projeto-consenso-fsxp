import java.util.Scanner;
public class Exercicio39 {
    public static void main(String[] args) {
        int num;
        int mult;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um número: ");
        num = entrada.nextInt();

        for (int i = 1; i <= 10; i++){
            mult = num * i;
            System.out.println(num + " x " + i + " = " + mult );
        }
        entrada.close();
}
}