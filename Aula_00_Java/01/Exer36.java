import java.util.Scanner;

public class Exer36 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int n = entrada.nextInt();
    entrada.close();

    for (int i = 1; i <= n; i++) {
        if(i == n){
            System.out.print("HO!");
        }
        else{
            System.out.print("HO ");
        }
    }
  }
}