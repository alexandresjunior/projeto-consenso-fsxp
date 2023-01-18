import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer numero = in.nextInt();

        in.close();

        String num = Integer.toString(numero);
        
        /*usando o metodo StringBuilder pra ter acesso ao 
        metodo reverse() e depois passando do reverse pra string*/ 
        String nova = new StringBuilder().append(num).reverse().toString();

        if(num.equals(nova)){   //caso String num for igual a string invertida
            System.out.println("S");
        }else{
            System.out.println("N");
        }
    }
}
