import java.util.Locale;
import java.util.Scanner;


public class Questa02 {

    public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print(" "); 
		int v1 = sc.nextInt();
		System.out.print(" ");
		int v2 = sc.nextInt();
		System.out.print(" ");
		double v3 = sc.nextDouble();
		
		System.out.println("NUMERO = " + v1);
		System.out.printf("SALARIO = R$ %.2f",(v2*v3) );

        sc.close();
	}
    
}
