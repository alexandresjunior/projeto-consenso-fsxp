import java.util.Scanner;
public class Exercicio25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String numeros = in.nextLine();
        in.close();
        boolean aprovado = true;

        if(numeros.charAt(0)== '0' && numeros.charAt(1) == '0'){
            aprovado = false;
        }
        if(numeros.charAt(2)== '0' || numeros.charAt(3)=='0'){
            aprovado = false;
        }
        if(numeros.charAt(4) != '1'){
            aprovado = false;
        }

        if(aprovado) System.out.println("AVALIADO");
        else System.out.println("0 (ZERO)");
    }
}
