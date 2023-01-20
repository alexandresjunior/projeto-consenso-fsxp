import java.util.Locale;
import java.util.Scanner;

public class Questao15{
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		int n = sc.nextInt();
		int i = 0;
		int j = 1;
		int k = i + j;
		
		if(n < 2) {
			System.out.println(i);
		} else if(n == 2) {
			System.out.print(i + " " + j);
		} else {
			System.out.print(i + " " + j + " ");
			for(int x = 2; x < n; x++) {
				System.out.print(k + " ");
				i = j;
				j= k;
				k = i + j;
			}
		}

        sc.close();
		
	}
}