package treinaRecife;

import java.util.Scanner;

public class Exercicio23 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    sc.close();

	   
	    System.out.println(a > b ? 1 : 0);
	    System.out.println(a == b ? 1 : 0);
	    System.out.println(a < b ? 1 : 0);
	    System.out.println(a != b ? 1 : 0);
	    System.out.println(a >= b ? 1 : 0);
	    System.out.println(a <= b ? 1 : 0);
	  }
}
