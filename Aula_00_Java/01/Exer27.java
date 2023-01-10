import java.util.Scanner;

public class Exer27 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int a = entrada.nextInt();
    int b = entrada.nextInt();
    int c = entrada.nextInt();
    int d = entrada.nextInt();
    entrada.close();

    // Calculate the average of the measurements
    double average = (a + b + c + d) / 4.0;

    // Determine the status of each measurement
    if (a < 110) {
      System.out.println(a + " NORMAL");
    } else if (a >= 110 && a <= 125) {
      System.out.println(a +" ALTERADA");
    } else {
      System.out.println(a +" MUITO ALTA");
    }
    if (b < 110) {
      System.out.println(b + " NORMAL");
    } else if (b >= 110 && b <= 125) {
      System.out.println(b +" ALTERADA");
    } else {
      System.out.println(b +" MUITO ALTA");
    }
    if (c < 110) {
      System.out.println(c + " NORMAL");
    } else if (c >= 110 && c <= 125) {
      System.out.println(c + " ALTERADA");
    } else {
      System.out.println(c + " MUITO ALTA");
    }
    if (d < 110) {
      System.out.println(d + " NORMAL");
    } else if (d >= 110 && d <= 125) {
      System.out.println(d + " ALTERADA");
    } else {
      System.out.println(d + " MUITO ALTA");
    }

    System.out.println("MÉDIA DAS LEITURAS = " + average);
  }
}
