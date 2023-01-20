import java.util.Locale;
import java.util.Scanner;

public class Questao39 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		int n = sc.nextInt();
		
		for(int i = 1; i < 11; i++) {
			System.out.println(n + " x " + i + " = " + n*i);
		}

        sc.close();
	}

}