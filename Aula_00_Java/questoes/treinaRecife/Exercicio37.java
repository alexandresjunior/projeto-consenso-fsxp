package treinaRecife;

import java.util.Scanner;

public class Exercicio37 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] u1 = entrada.nextLine().split(" ");
        String u1Nome = u1[0];
        int u1Numero = Integer.parseInt(u1[2]);
        String[] u2 = entrada.nextLine().split(" ");
        String u2Nomes = u2[0];
        int u2Numero = Integer.parseInt(u2[2]);
        entrada.close();
        String g = "";
        int sum = u1Numero + u2Numero;
        if (sum % 2 == 0) {
            g = u1[1].equalsIgnoreCase("PAR") ? u1Nome : u2Nomes;
        } else if(sum % 2 == 1) {
            g = u1[1].equalsIgnoreCase("IMPAR") ? u1Nome : u2Nomes;
        }
        System.out.println(g);

    }
}
