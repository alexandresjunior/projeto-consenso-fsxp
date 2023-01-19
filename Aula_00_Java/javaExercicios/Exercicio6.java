package javaExercicios;
import java.util.Scanner;

public class Exercicio6 {
	
	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int distance = scanner.nextInt();
	    double fuel = scanner.nextDouble();

	    double average_consumption = distance / fuel;

	    System.out.printf("%.3f km/l", average_consumption);
	  }
	}



