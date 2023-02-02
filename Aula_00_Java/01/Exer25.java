import java.util.Scanner;

public class Exer25 {
  public static void main(String[] args) {
    Scanner entrada= new Scanner(System.in);
    String a = entrada.nextLine();
    entrada.close();

    String[] r = a.split(" ");

    if (r[0].equals("1") || r[1].equals("1") && r[2].equals("1") && r[3].equals("1") && r[4].equals("1")) {
        System.out.println("AVALIADO");
    } else {
        System.out.println("0");
    }
  }
}
