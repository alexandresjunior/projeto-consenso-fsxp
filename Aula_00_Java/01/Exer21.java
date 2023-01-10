import java.util.ArrayList;
import java.util.Scanner;

public class Exer21 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    entrada.close();

    ArrayList<Integer> a = new ArrayList<>();
    ArrayList<Double> b = new ArrayList<>();

    for (int i = 0; i < 3; i++) {
      int c = entrada.nextInt();
      double d = entrada.nextDouble();
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

    System.out.println("Ano do carro mais novo = " + n);
    System.out.println("Velocidade do mais rápido = " + r);
  }
}
