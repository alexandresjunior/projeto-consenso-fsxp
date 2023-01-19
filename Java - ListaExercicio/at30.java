import java.util.Scanner;

public class at30 {
    
    public static void main(String[] args) {
        
		Scanner entrada = new Scanner(System.in);
        int X, Y;
        
		System.out.println("Digite os valores: ");
		while (((X = entrada.nextInt()) > 0) && ((Y = entrada.nextInt()) > 0)) {
			int soma = 0;
			if (X > Y) {
				for (Y = Y; Y <= X; Y++) {
					soma += Y;
					System.out.print(Y + " ");
				}
				System.out.println("Soma=" + soma);
			} else {
				for (X = X; X <= Y; X++) {
					soma += X;
					System.out.print(X + " ");
				}
				System.out.println("Soma=" + soma);
			}
            entrada.close();
    }
}
}
