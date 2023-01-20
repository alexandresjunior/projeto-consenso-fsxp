package de_41_a_50;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio41 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		double alt = sc.nextDouble();
		System.out.print("- ");
		double peso = sc.nextDouble();
		double pesoideal = 0;
		
		
		if(alt <= 1.5) {
			pesoideal = 50;
			if(peso == pesoideal) {
				System.out.println("Parabens pelo peso ideal");
			}else if(peso < pesoideal){
				System.out.println("Engorde " + (pesoideal-peso) + " kg");
			} else {
				System.out.println("Emagreça " + (peso-pesoideal) + " kg");
			}
		} else if(alt >= 1.5 && alt <= 1.90) {
			pesoideal = 70;
			if(peso == pesoideal) {
				System.out.println("Parabens pelo peso ideal");
			}else if(peso < pesoideal){
				System.out.println("Engorde " + (pesoideal-peso) + " kg");
			} else {
				System.out.println("Emagreça " + (peso-pesoideal) + " kg");
			}
		} else if(alt > 1.9) {
			pesoideal = 100;
			if(peso == pesoideal) {
				System.out.println("Parabens pelo peso ideal");
			}else if(peso < pesoideal){
				System.out.println("Engorde " + (pesoideal-peso) + " kg");
			} else {
				System.out.println("Emagreça " + (peso-pesoideal) + " kg");
			}
		} 
		sc.close();
	}

}
