import java.util.Arrays;
import java.util.Scanner;

public class Exer05{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++){
            a[i] = (entrada.nextInt());
        }
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) 
        {
          System.out.println(a[i]);       		
        }    
    }
}