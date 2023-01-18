import java.util.Scanner;
public class Exercicio34 {

    public static void main(String[] args)  {
		int X,Y;
		Scanner entrada = new Scanner(System.in);
		
        System.out.println("Insira o 1° valor:");
        X = entrada.nextInt();
        System.out.println("Insira o 2° valor:");
		Y = entrada.nextInt();
		
		for (int i = 1; i <= Y; i++) {
			System.out.print(i);
			if (i % X == 0) System.out.println("");
			else System.out.print(" ");
            entrada.close();
		}
    }
}