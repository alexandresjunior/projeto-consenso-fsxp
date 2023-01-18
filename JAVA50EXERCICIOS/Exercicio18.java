import java.util.Scanner;
public class Exercicio18 {
    public static void main(String args[]) {
        int numeroInverte;
        int numeroInvertido = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Escolha um número para ser invertido: ");
        numeroInverte= entrada.nextInt();

        while (numeroInverte > 0) {
            numeroInvertido = numeroInvertido * 10;
            numeroInvertido = numeroInvertido + (numeroInverte % 10);
            numeroInverte = numeroInverte / 10;
		}
		System.out.println(numeroInvertido);
        entrada.close();
    }
}

