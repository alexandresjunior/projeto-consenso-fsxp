import java.util.Locale;
import java.util.Scanner;

public class Questao40 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		int l1 = sc.nextInt();
		System.out.print("- "); 
		int l2 = sc.nextInt();
		System.out.print("- "); 
		int l3  = sc.nextInt();
		int i = 0;
		if(l1 == l2) {
			i++;
		} if(l1 == l3) {
			i++;
		} if (l2 == l3) {
			i++;
		}
		
		if(i == 0) {
			System.out.println("ESCALENO");
		} else if(i == 1) {
			System.out.println("ISOSCELES");
		} else {
			System.out.println("EQUILATERO");
		}

        sc.close();
	}

}