import java.util.Locale;
import java.util.Scanner;

public class Questao18 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		Integer n = sc.nextInt();
		String str = n.toString();
		
		String reverse = "";
		
		int j = 0;
		for(int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		
		System.out.println(Integer.valueOf(reverse));

        sc.close();
	}

}