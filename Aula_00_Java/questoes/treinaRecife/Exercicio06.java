package treinaRecife;
import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
	   
	    Scanner entrada = new Scanner(System.in);
	    System.out.print("Digite a distância total percorrida (em km): ");
	    int distancia = entrada.nextInt();
	    System.out.print("Digite o total de combustível gasto (em litros): ");
	    double combustivel = entrada.nextDouble();
	    entrada.close();
	
	    double consumoMedio = distancia / combustivel;
	    
	    	
	    System.out.printf("%.2f", consumoMedio);
	    System.out.print("km/l");

	  }
}
