import java.util.Locale;
import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		int i = sc.nextInt();
		
		int a = i / 365;
		int resto = i % 365;
		int m = resto / 30;
		int d = resto % 30;
		
		System.out.println(a + " ano(s)");
		System.out.println(m + " mes(es)");
		System.out.println(d + " dia(s)");

        sc.close();
	}

}
