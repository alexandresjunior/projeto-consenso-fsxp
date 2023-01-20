import java.util.Locale;
import java.util.Scanner;

public class Questao37 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Jogador 1: ");
		System.out.print("Nome - ");
		String n1 = sc.nextLine();
		System.out.println("par ou impar - ");
		String ip1 = sc.nextLine();
		System.out.println("numero - ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.println("--------------------");
		System.out.println("Jogador 2: ");
		System.out.print("Nome - ");
		String n2 = sc.nextLine();
		System.out.println("par ou impar - ");
		String ip2 = sc.nextLine();
		System.out.println("numero - ");
		int num2 = sc.nextInt();
		
		
		if((num1 + num2) % 2 == 0) {
			if(ip1.equalsIgnoreCase("par")) {
				System.out.println("Vencedor: " + n1);
			}
			else {
				System.out.println("Vencedor: " + n2);
			}
		} else {
			if(ip1.equalsIgnoreCase("impar")) {
				System.out.println("Vencedor: " + n1);
			}
			else {
				System.out.println("Vencedor: " + n2);
			}
		}

        sc.close();
	}

}
