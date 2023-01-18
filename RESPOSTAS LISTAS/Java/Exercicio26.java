import java.util.Scanner;
public class Exercicio26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float altura = in.nextFloat();
        int idade = in.nextInt();
        in.close();
        
        int cont = 0;
        if(altura >= 1.5 && idade >= 12) cont++;
        if(altura >= 1.4 && idade >= 14) cont++;
        if(altura >= 1.7 || idade >= 16) cont++;

        System.out.println(cont);
    }
}