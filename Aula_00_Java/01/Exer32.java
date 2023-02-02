import java.util.Scanner;

public class Exer32 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int ac = 0;
    int gc = 0;
    int dc = 0;
    double al = 0;
    double gl = 0;
    double dl = 0;

    for (int i = 0; i < 5; i++) {
      int tipo = entrada.nextInt();
      double l = entrada.nextDouble();

      if (tipo == 1) {
        ac++;
        al += l;
      } else if (tipo == 2) {
        gc++;
        gl += l;
      } else if (tipo == 3) {
        dc++;
        dl += l;
      }
    }
    entrada.close();

    System.out.println("Alcool: " + ac + " cliente, " + al + " litros");
    System.out.println("Gasolina: " + gc + " clientes, " + gl + " litros");
    System.out.println("Dissel: " + dc + " clientes, " + dl + " litros");
    }
}
