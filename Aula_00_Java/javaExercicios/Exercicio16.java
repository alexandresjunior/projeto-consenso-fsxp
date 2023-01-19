package javaExercicios;
import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        double populationA = sc.nextDouble();
        double populationB = sc.nextDouble();
        sc.close();

        int years = 0;
        while (populationA < populationB) {
            populationA += populationA * 0.03;
            populationB += populationB * 0.015;
            years++;
        }

        System.out.println(years);

	}

}
