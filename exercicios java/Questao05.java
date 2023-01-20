import java.util.Scanner;
public class Questao05 {
	//Faça um programa que leia do teclado três valores inteiros e exiba-os em ordem crescente.//
    public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);

		System.out.println("Insira o 1° número: ");
        int n1 = teclado.nextInt();
		System.out.println("Insira o 2° número: ");
        int n2 = teclado.nextInt();
		System.out.println("Insira o 3° número: ");
        int n3 = teclado.nextInt();

		if( n1 < n2 && n2 < n3 ) {
			System.out.println ( n1 + " " + n2 + " " + n3);

		} else if( n1 < n3 && n3 < n2 ) {
			System.out.println ( n1 + " " + n3 + " " + n2);

		} else if( n2 < n1 && n1 < n3 ) {
			System.out.println ( n2 + " " + n1 + " " + n3);

		} else if( n2 < n3 && n3 < n1 ) {
		    System.out.println ( n2 + " " + n3 + " " + n1);

		} else if( n3 < n2 && n2 < n1 ) {
			System.out.println ( n3 + " " + n2 + " " + n1);

		} else if( n3 < n1 && n1 < n2 ) {
            System.out.println ( n3 + " " + n1 + " " + n2);
        }
	}
	}

