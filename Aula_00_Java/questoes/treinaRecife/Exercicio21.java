package treinaRecife;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio21 {
	 public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    sc.close();

		    ArrayList<Integer> a = new ArrayList<>();
		    ArrayList<Double> b = new ArrayList<>();

		    for (int i = 0; i < 3; i++) {
		      int c = sc.nextInt();
		      double d = sc.nextDouble();
		      a.add(c);
		      b.add(d);
		    }

		    int n = a.get(0);
		    for (int c : a) {
		      if (c > n) {
		        n = c;
		      }
		    }

		    double r = b.get(0);
		    for (double d : b) {
		      if (d > r) {
		        r = d;
		      }
		    }

		    System.out.println("carro mais novo: " + n);
		    System.out.println("mais rápido:  " + r);
		  }
}
