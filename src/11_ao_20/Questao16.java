import java.util.Locale;
import java.util.Scanner;

public class Questao16 {

	public static void main(String[] args) {
		
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("A - "); 
		int a = sc.nextInt();
		System.out.print("B - ");
		int b = sc.nextInt();
		int i = 0;
		if(a < b) {
			while(a < b) {
				a *= 1.03;
				b *= 1.015;
				i++;
			}
			System.out.println(i + " anos");
		} else {
			System.out.println("o valor A precisa ser menor que B");
		}

        sc.close();
	}

}
