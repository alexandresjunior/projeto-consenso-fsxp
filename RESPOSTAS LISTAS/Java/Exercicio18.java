import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer numero = in.nextInt();
        in.close();

        String num = Integer.toString(numero);
        /*usando o metodo StringBuilder pra ter acesso ao 
        metodo reverse() e depois passando do reverse pra string*/ 
        String nova = new StringBuilder().append(num).reverse().toString();
        int novo = Integer.parseInt(nova);
        System.out.println(novo);

    }
}