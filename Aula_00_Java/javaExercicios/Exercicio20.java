package javaExercicios;
import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        String neighborhoodCode = sc.next();
	        double familyIncome = sc.nextDouble();
	        double consumption = sc.nextDouble();
	        sc.close();

	        double discount = 0;
	        if (neighborhoodCode.equals("S")) {
	            if (familyIncome < 2000 && consumption > 100) {
	                discount = consumption * 0.03;
	            } else if (familyIncome >= 2000 && familyIncome < 5000 && consumption > 100) {
	                discount = consumption * 0.05;
	            } else if (familyIncome >= 5000 && consumption > 100) {
	                discount = consumption * 0.07;
	            }
	        } else if (neighborhoodCode.equals("I")) {
	            if (familyIncome < 2000 && consumption > 100) {
	                discount = consumption * 0.05;
	            } else if (familyIncome >= 2000 && familyIncome < 5000 && consumption > 100) {
	                discount = consumption * 0.08;
	            } else if (familyIncome >= 5000 && consumption > 100) {
	                discount = consumption * 0.1;
	            }
	        } else if (neighborhoodCode.equals("T")) {
	            if (familyIncome < 2000 && consumption > 100) {
	                discount = consumption * 0.02;
	            } else if (familyIncome >= 2000 && familyIncome < 5000 && consumption > 100) {
	                discount = consumption * 0.03;
	            } else if (familyIncome >= 5000 && consumption > 100) {
	                discount = consumption * 0.05;
	            }
	        } else {
	            System.out.println("Código de bairro inválido!");
	            return;
	        }
	        
	        if (familyIncome < 0 || consumption < 0) {
	            System.out.println("Renda ou consumo inválidos");
	            return;
	        }
	        System.out.println(discount);
	    

	}

}
