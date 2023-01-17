package exercicios_java_experience;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		int  i = scanner.nextInt();
		int cont = 0;
		
		if (a >=1.5 && i >= 12) {
			//Barca Viking
			cont+=1;
		}
		if (a >=1.4 && i >= 14) {
			//Elevator of Death
			cont+=1;
		}
		if(a >=1.7 || i  >=16) {
			//Final Killer
			cont+=1;
		}
		System.out.println(cont);
		
	}

}
