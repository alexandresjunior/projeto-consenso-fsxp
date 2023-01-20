import java.util.Locale;
import java.util.Scanner;

public class Questao43 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		int preco = sc.nextInt();
		System.out.print("- ");
		int pago = sc.nextInt();
		
		int troco = pago - preco;
		
		boolean possivel = false;
		
		if(troco / 100 == 2) possivel = true;
		if(troco / 50 == 2) possivel = true;
		if(troco / 20 == 2) possivel = true;
		if(troco / 10 == 2) possivel = true;
		if(troco / 5 == 2) possivel = true;
		if(troco / 2 == 2) possivel = true;
		
		
		if(possivel) {
			System.out.println("Possivel");
		}else {
			System.out.println("Impossivel");
		}

        sc.close();
	}

}