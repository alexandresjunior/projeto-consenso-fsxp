import java.util.Locale;
import java.util.Scanner;


public class Questao03 {
    public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print(" "); 
		String nome = sc.nextLine();
		System.out.print(" ");
		double sal = sc.nextDouble();
		System.out.print(" ");
		double venda = sc.nextDouble();
		
		System.out.printf("TOTAL = R$ %.2f", (sal + venda*0.15));

        sc.close();

    
}
}
