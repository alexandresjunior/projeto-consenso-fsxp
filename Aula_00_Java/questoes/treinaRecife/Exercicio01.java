package treinaRecife;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Digite a nota A: ");
	    float notaA = (float) scanner.nextDouble();
	    System.out.print("Digite a nota B: ");
	    float notaB = (float) scanner.nextDouble();
	    scanner.close();
	    
	    double media = ((notaA * 3.5 + notaB * 7.5) / 11);

	    
	    System.out.println("MÉDIA = " + media);
	  }
}
