package javaExercicios;
import java.util.Scanner;

public class Exercicio41 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        double weight = sc.nextDouble();
	        double height = sc.nextDouble();

	        double idealWeight = 0;
	        if (height <= 1.50) {
	            idealWeight = 50;
	        } else if (height <= 1.90) {
	            idealWeight = 70;
	        } else {
	            idealWeight = 100;
	        }

	        if (weight == idealWeight) {
	            System.out.println("Parabéns peso ideal");
	        } else if (weight < idealWeight) {
	            System.out.println("Engorde " + (idealWeight - weight) + " Kg");
	        } else {
	            System.out.println("Emagreça " + (weight - idealWeight) + " Kg");
	        }
	    }
	}