import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = in.nextInt(), j = in.nextInt(), k = in.nextInt();

        if(i < (j + k) && j < (i + k) && k < (j + i)){
            if(i == j && j == k){ //equilatero
                System.out.println("EQUILÁTERO");
            }else if(i == j || j == k || i == k){
                System.out.println("ISÓSCELES");
            }else{
                System.out.println("ESCALENO");
            }
        }else{
            System.out.println("VALORES NÃO FORMAM UM TRIÂNGULO");
        }
        in.close();
    }
}