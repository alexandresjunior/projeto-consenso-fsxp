package javaExercicios;
import java.text.DecimalFormat; // DecimalFormat permite formatar números reais,
import java.util.Scanner;

public class Exercicio42 {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double oldPrice = sc.nextDouble();
	        double newPrice = sc.nextDouble();

	        double increase = (newPrice - oldPrice) / oldPrice * 100;
	        DecimalFormat df = new DecimalFormat("#.00");
	        System.out.println(df.format(increase) + "%");
	    }
	}

