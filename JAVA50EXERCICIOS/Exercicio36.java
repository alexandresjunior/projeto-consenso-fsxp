import java.util.Scanner;
public class Exercicio36 {


public static void main(String[] args) {
    int num;
    int x = 0;
    Scanner entrada = new Scanner(System.in);
		
        System.out.println("Insira o 1° valor:");
        num = entrada.nextInt();

        while (x < num - 1){
            System.out.print("HO" + " ");
            x++;
        }
        System.out.print("HO!");

        entrada.close();

}
    
}
