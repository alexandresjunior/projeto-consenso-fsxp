import java.util.Locale;
import java.util.Scanner;

public class Questao42 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		double p1 = sc.nextDouble();
		System.out.print("- ");
		double p2 = sc.nextDouble();
		
		double aumento = p2 - p1;
		
		System.out.println((aumento/p1)*100 + "%");

        sc.close();
	}

}
