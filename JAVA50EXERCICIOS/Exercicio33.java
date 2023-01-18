import java.util.Scanner;
public class Exercicio33 {
    public static void main(String[] args) {
        int n;
        int x = 0;
        int p = 1;
        int q = 2;
        int r = 3;
        Scanner entrada =new Scanner(System.in);
        System.out.print("Digite um numero: ");
        n = entrada.nextInt();

        while (x < n){
           
            System.out.println(p + " " + q + " " + r+ " PUM");
            p = p + 4;
            q = q + 4;
            r = r + 4;
            x++;
        }
        entrada.close();
    
}
}