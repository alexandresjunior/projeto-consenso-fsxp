package de_01_a_10;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		/*
		 * Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis
(cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100,
50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

		 * */
		Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("- ");
        int v1 = sc.nextInt();

        int notacem = v1 / 100;

        v1 = v1 % 100;

        int notacinq = v1 / 50;

        v1 = v1 % 50;

        int notavinte = v1 / 20;

        v1 = v1 % 20;

        int notadez = v1 / 10;

        v1 = v1 % 10;

        int notacinco = v1 / 5;

        v1 = v1 % 5;

        int notadois = v1 / 2;

        v1 = v1 % 2;

        int notaum = v1 / 1;

        System.out.println(notacem + " notas de  R$ 100.00");
        System.out.println(notacinq + " notas de  R$ 50.00");
        System.out.println(notavinte + " notas de  R$ 20.00");
        System.out.println(notadez + " notas de  R$ 10.00");
        System.out.println(notacinco + " notas de  R$ 5.00");
        System.out.println(notadois + " notas de  R$ 2.00");
        System.out.println(notaum + " notas de  R$ 1.00");
	}

}
