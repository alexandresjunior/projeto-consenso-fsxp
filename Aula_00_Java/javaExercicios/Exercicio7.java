package javaExercicios;
import java.util.Scanner;

public class Exercicio7 {
	
	  public static void main(String[] args) {
		  
		    Scanner scanner = new Scanner(System.in);

		    int value = scanner.nextInt();

		    System.out.println(value);

		    int notes100 = value / 100;
		    value %= 100;
		    System.out.println(notes100 + " nota(s) de R$ 100,00");

		    int notes50 = value / 50;
		    value %= 50;
		    System.out.println(notes50 + " nota(s) de R$ 50,00");

		    int notes20 = value / 20;
		    value %= 20;
		    System.out.println(notes20 + " nota(s) de R$ 20,00");

		    int notes10 = value / 10;
		    value %= 10;
		    System.out.println(notes10 + " nota(s) de R$ 10,00");

		    int notes5 = value / 5;
		    value %= 5;
		    System.out.println(notes5 + " nota(s) de R$ 5,00");

		    int notes2 = value / 2;
		    value %= 2;
		    System.out.println(notes2 + " nota(s) de R$ 2,00");

		    int notes1 = value / 1;
		    value %= 1;
		    System.out.println(notes1 + " nota(s) de R$ 1,00");
		  }
	}
