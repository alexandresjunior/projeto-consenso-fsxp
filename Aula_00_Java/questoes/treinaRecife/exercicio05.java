package treinaRecife;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio05 {
	public static void main(String[] args) {
		
		List<Integer> List = new ArrayList<>();
		
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i<3; i++) {
			System.out.println("digite um numero: ");
			int numero = entrada.nextInt();
			List.add(numero);
		}
		entrada.close();
		List.sort(null);
		System.out.println(List);
		
	}
}
