package de_21_a_30;

import java.util.Locale;
import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa que leia dois valores inteiros (x e y) e imprima na tela o
resultado das seguintes comparações entre estes dois valores, exatamente nesta
ordem:
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- ");
		int i = sc.nextInt();
		System.out.println("- ");
		int j = sc.nextInt();
		
		if(i > j) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		if(i == j) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		if(i < j) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		if(i != j) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		if(i >= j) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		if(i <= j) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
		
	}

}
