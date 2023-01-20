import java.util.Locale;
import java.util.Scanner;

public class Questao26 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		double alt = sc.nextDouble();
		System.out.print("- ");
		int idade = sc.nextInt();
		
		int i = 0;
		
		if(alt >= 1.5 && idade >= 12) {
			i++;
		}
		if(alt >= 1.4 && idade >=14) {
			i++;
		}
		if(alt >= 1.7 || idade >= 16) {
			i++;
		}
		
		System.out.println(i);

        sc.close();
	}

}