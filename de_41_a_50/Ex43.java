package de_41_a_50;

import java.util.Locale;
import java.util.Scanner;

public class Ex43 {

	public static void main(String[] args) {
		
		/*
		 * Gilberto é um famoso vendedor de esfirras na região. Porém, apesar de todos
gostarem de suas esfihas, ele só sabe dar o troco com duas notas, ou seja, nem
sempre é possível receber o troco certo. Para facilitar a vida de Gil, escreva um
programa para ele que determine se é possível ou não devolver o troco exato
utilizando duas notas.
As notas disponíveis são: 2, 5, 10, 20, 50 e 100.
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		int preco = sc.nextInt();
		System.out.print("- ");
		int pago = sc.nextInt();
		
		int troco = pago - preco;
		
		boolean possivel = false;
		
		if(troco / 100 == 2) possivel = true;
		if(troco / 50 == 2) possivel = true;
		if(troco / 20 == 2) possivel = true;
		if(troco / 10 == 2) possivel = true;
		if(troco / 5 == 2) possivel = true;
		if(troco / 2 == 2) possivel = true;
		
		
		if(possivel) {
			System.out.println("Possivel");
		}else {
			System.out.println("Impossivel");
		}
	}

}
