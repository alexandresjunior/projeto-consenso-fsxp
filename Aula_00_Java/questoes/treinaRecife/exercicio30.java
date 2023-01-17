package treinaRecife;

import java.util.Scanner;

public class exercicio30 {
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    int[] a = new int[3];
	    int s = 0;
	    int[] b = new int[3];
	    for (int i = 0; i < 3; i++) {
	        int m = entrada.nextInt();
	        int n = entrada.nextInt();

	        a[i] = Math.min(m, n);
	        b[i] = Math.max(m, n);
	    }
	    for(int i = 0; i < 3; i++){
	        for (int j = a[i]; j <= b[i]; j++) {
	            System.out.print(j + " ");
	            s += j;
	        }
	        System.out.println("Soma = " + s);
	    }
	    entrada.close();
	  }
}
