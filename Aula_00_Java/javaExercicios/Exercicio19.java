package javaExercicios;
import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        double currentSalary = sc.nextDouble();
	        sc.close();

	        double newSalary = currentSalary;
	        if (currentSalary > 500) {
	            newSalary = currentSalary * 1.10;
	        } else if (currentSalary > 300) {
	            newSalary = currentSalary * 1.07;
	        } else {
	            newSalary = currentSalary * 1.05;
	        }
	        System.out.println(newSalary);
	    

	}

}
