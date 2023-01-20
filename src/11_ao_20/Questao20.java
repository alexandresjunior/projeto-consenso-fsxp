import java.util.Locale;
import java.util.Scanner;

public class Questao20 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		String cid = sc.next();
		System.out.print("- ");
		double v1 = sc.nextDouble();
		System.out.print("- ");
		double v2 = sc.nextDouble();
		
		
		if(v1 < 0 || v2 < 0) {
			
			System.out.println("renda e consumo nao podem ser negativos.");
			
		} else if(cid.equalsIgnoreCase("S")) {
			
			if(v1 >= 50 && v1 <= 500) {
				v2 -= 50;
			} else if(v1 > 500 && v1 <= 1000) {
				v2 -= 25;
			}
			
			System.out.println(v2);
			
		} else if(cid.equalsIgnoreCase("I")) {
			
			if(v1 >= 240 && v1 <= 1000) {
				v2 -= 240;
			} else if(v1 > 1000 && v1 <= 5000) {
				v2 -= 120;
			}
			
			System.out.println(v2);
			
			
		} else if(cid.equalsIgnoreCase("T")) {
			if(v1 > 5000 && v1 <= 10000) {
				v2 -= 720;
			} else if(v1 > 10000 && v1 <= 20000) {
				v2 -= 360;
			}
			
			System.out.println(v2);
			
		} else {
			
			System.out.println("Valor invalido");
		}
		
		sc.close();
	}

}