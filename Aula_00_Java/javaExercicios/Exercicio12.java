package javaExercicios;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
        String firstWord = sc.nextLine();
        String secondWord = sc.nextLine();
        String thirdWord = sc.nextLine();

        if (firstWord.equals("vertebrado")) {
            if (secondWord.equals("ave")) {
                if (thirdWord.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if (thirdWord.equals("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }
        } else {
            if (secondWord.equals("inseto")) {
                if (thirdWord.equals("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else {
                if (thirdWord.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }

        sc.close();
	}

}
