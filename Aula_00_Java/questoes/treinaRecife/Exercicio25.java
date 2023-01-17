package treinaRecife;

import java.util.Scanner;

public class Exercicio25 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int interfaceGrafica = scanner.nextInt();
	        int inteligenciaArtificial = scanner.nextInt();
	        int encapsulamento = scanner.nextInt();
	        int indentacao = scanner.nextInt();
	        int structs = scanner.nextInt();
	        scanner.close();
	        if (interfaceGrafica == 1 || inteligenciaArtificial == 1 && encapsulamento == 1 && indentacao == 1 && structs == 1) {
	            System.out.println("AVALIADO");
	        } else {
	            System.out.println(0);
	        }
	    }
}
