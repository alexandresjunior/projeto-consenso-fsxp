import java.util.Locale;
import java.util.Scanner;

public class Questao34 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		int col = sc.nextInt();
		int n = sc.nextInt();
		int x = 1;
		for(int i = 1; i <= n;) {
			for(int j = 0; j < col	; j++) {
				if(i > n) {break;}
				System.out.print(i + " ");
				i++;
				
			}
			System.out.println();
		
		}

        sc.close();
	}

}