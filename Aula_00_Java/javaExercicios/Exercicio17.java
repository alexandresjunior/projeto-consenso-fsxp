package javaExercicios;
import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        for (int i = 0; i < n; i++) {
	            int x = sc.nextInt();
	            if (isPrime(x)) {
	                System.out.println(x + 
	               
	" é primo");
	            } else {
	                System.out.println(x + " não é primo");
	            }
	        }
	        sc.close();
	    }
	    
	    public static boolean isPrime(int x) {
	        if (x < 2) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(x); i++) {
	            if (x % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	

}
