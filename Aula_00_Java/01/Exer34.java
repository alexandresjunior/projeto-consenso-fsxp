import java.util.Scanner;

public class Exer34 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int x = entrada.nextInt();
    int y = entrada.nextInt();
    entrada.close();

    for (int i = 1; i <= y; i++) {
      System.out.print(i + " ");
      if (i % x == 0) {
        System.out.println();
      }
    }
  }
}