package treinaRecife;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int hinicial, hfinal;
		System.out.println("digite a hora inicial e depois a final; ");
		hinicial = entrada.nextInt();
		hfinal = entrada.nextInt();
		
		int htotal = 0;
		
		if (hinicial < hfinal) {
			htotal = hfinal - hinicial;
		}
		else if(hinicial > hfinal) {
			htotal = hfinal + (24 - hinicial);
		}
		else if(hinicial== 0 && hfinal == 0) {
			htotal = 24;
		}
		System.out.println("o jogo durou : "+ htotal);
	}
}
