import java.util.Locale;
import java.util.Scanner;

public class Questao50 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- ");
		
		int n = sc.nextInt();
		
		Integer x = 0;
		for(int i = 0; i < n; i++) {
			x++;
			while(x.toString().contains("13")) {
				x++;
			}
			while(x.toString().contains("4")) {
				x++;
			}
			
			
		}
		System.out.println(x);

        sc.close();
	}

}