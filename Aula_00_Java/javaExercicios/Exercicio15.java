package javaExercicios;
import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        sc.close();

	        int a = 0, b = 1;
	        for (int i = 0; i < n; i++) {
	            System.out.print(a + " ");
	            int temp = a + b;
	            a = b;
	            b = temp;
	        }
	        
	}

}
