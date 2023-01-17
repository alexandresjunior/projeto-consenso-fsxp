package treinaRecife;

import java.util.Scanner;

public class Exercicio43 {
	public class Exer43 {
	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	        int vc = entrada.nextInt();
	        int vp = entrada.nextInt();
	        entrada.close();
	        int t = vp - vc;
	        if (t % 2 == 0) {
	            System.out.println("possível");
	        } else {
	            System.out.println("impossível");
	        }
	    }
	}
}
