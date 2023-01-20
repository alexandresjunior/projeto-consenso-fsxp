package de_01_a_10;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = 3;
		int[] array = new int[n];
		for(int i = 0; i < array.length; i++) {
			System.out.print("- ");
			array[i] = sc.nextInt();
		}
		
		Arrays.sort(array);
		
		for(int a : array) {
			System.out.println(a);
			sc.close();
		}
	}
}
