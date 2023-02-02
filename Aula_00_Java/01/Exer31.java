import java.util.Scanner;

public class Exer31 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double s = 0;
    int count = 0;

    while (count < 4) {
      double g = entrada.nextDouble();
      if (g >= 0 && g <= 10) {
        s += g;
        count++;
      } else {
        System.out.println("NOTA INVÁLIDA");
      }
    }

    double a = s / 4;
    System.out.println("MÉDIA = " + a);
    entrada.close();
  }
}
