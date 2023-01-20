import java.util.Locale;
import java.util.Scanner;

public class Questao48 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		int idade = sc.nextInt();
		System.out.print("- ");
		double peso = sc.nextDouble();
		int mg = 0;
		
		if(idade >= 12) {
			if(peso >= 60) {
				mg = 1000;
			}else {
				mg = 875;
			}
		}else {
			if(peso >= 5 && peso <= 9) {
				mg = 125;
			} else if(peso > 9 && peso <= 16) {
				mg = 250;
			} else if(peso > 16 && peso <= 24) {
				mg = 375;
			} else if(peso > 24 && peso <= 30) {
				mg = 500;
			} else if(peso > 30){
				mg = 750;
			}
		}
		int gotas = mg / 25;
		
		System.out.println(gotas + " gotas");

        sc.close();
	}

}
