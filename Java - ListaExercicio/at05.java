import java.util.Arrays;
import java.util.Scanner;

public class at05 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] valores = new int[3];

        for (int c = 0; c < 3; c++) {
            System.out.println("Digite o " + (c + 1) + " valor: ");
            valores[c] = teclado.nextInt();
        }
        Arrays.sort(valores);

        for (int c = 0; c < 3; c++) {
            System.out.println(valores[c]);
        }
        
        teclado.close();
    }
    
}
