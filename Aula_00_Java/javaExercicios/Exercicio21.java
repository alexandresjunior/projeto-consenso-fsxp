package javaExercicios;
import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int newestCar = 0;
	        double fastestCar = 0;
	        double totalSpeed = 0;
	        for (int i = 1; i <= 3; i++) {
	            int year = sc.nextInt();
	            double speed = sc.nextDouble();
	            totalSpeed += speed;
	            if (i == 1) {
	                newestCar = year;
	                fastestCar = speed;
	            } else {
	                if (year > newestCar) {
	                    newestCar = year;
	                }
	                if (speed > fastestCar) {
	                    fastestCar = speed;
	                }
	            }
	        }
	        sc.close();
	        System.out.println("Carro mais novo: " + newestCar);
	        System.out.println("Carro mais rápido: " + fastestCar);
	        System.out.println("Velocidade média: " + totalSpeed / 3);
	    

	}

}
