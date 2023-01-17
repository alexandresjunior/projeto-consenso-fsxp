package exercicios_java_experience;

import java.util.Scanner;

public class Exercicio43 {

	public static void main(String[] args) {
		 	Scanner scanner = new Scanner(System.in);
	        int vc = scanner.nextInt();
	        int vp = scanner.nextInt();
	        scanner.close();
	        int t = vp - vc;
	        if (t % 2 == 0) {
	            System.out.println("possível");
	        } else {
	            System.out.println("impossível");
	        }

	}

}
