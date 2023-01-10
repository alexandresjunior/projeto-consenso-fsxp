import java.util.Scanner;

public class Exer23 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int x = entrada.nextInt();
    int y = entrada.nextInt();
    entrada.close();

    // x is greater than y
    System.out.println(x > y ? 1 : 0);

    // x equals y
    System.out.println(x == y ? 1 : 0);

    // x is less than y
    System.out.println(x < y ? 1 : 0);

    // x is different from y
    System.out.println(x != y ? 1 : 0);

    // x is greater than or equal to y
    System.out.println(x >= y ? 1 : 0);

    // x is less than or equal to y
    System.out.println(x <= y ? 1 : 0);
  }
}