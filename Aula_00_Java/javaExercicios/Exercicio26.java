package javaExercicios;
import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        
	        // lê a altura e a idade da pessoa
	        double altura = sc.nextDouble();
	        int idade = sc.nextInt();
	        sc.close();
	        
	        // define as restrições de cada brinquedo
	        double alturaMinBarcaViking = 1.5;
	        int idadeMinBarcaViking = 12;
	        double alturaMinElevatorOfDeath = 1.4;
	        int idadeMinElevatorOfDeath = 14;
	        double alturaMinFinalKiller = 1.7;
	        int idadeMinFinalKiller = 16;
	        
	        // inicializa o contador de brinquedos
	        int brinquedosPermitidos = 0;
	        
	        // verifica se a pessoa atende às restrições de cada brinquedo
	        if (altura >= alturaMinBarcaViking || idade >= idadeMinBarcaViking) {
	            brinquedosPermitidos++;
	        }
	        if (altura >= alturaMinElevatorOfDeath || idade >= idadeMinElevatorOfDeath) {
	            brinquedosPermitidos++;

	    }

	}
}
