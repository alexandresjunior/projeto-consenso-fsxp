package javaExercicios;
import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
		double s = 0;
        double denominator = 1;
        for (int i = 1; i <= 39; i += 2) {
            s += (double) i / denominator;
            denominator *= 2;
        }
        System.out.println("S = " + s);
    }
}
