import java.util.Arrays;
import java.util.Scanner;

public class at04 {
    
    public static void main(String [] args) {
       
        Scanner teclado = new Scanner(System.in);

        int[] valores = new int[3];

        for (int c = 0; c < 3; c++) {
            System.out.println("Digite o " + (c + 1) + " número: ");
            valores[c] = teclado.nextInt();
        }
        Arrays.sort(valores);

        System.out.println("MAIOR = " + valores[2]);
        System.out.println("MENOR = " + valores[0]);
        
        teclado.close();
    }
}



    