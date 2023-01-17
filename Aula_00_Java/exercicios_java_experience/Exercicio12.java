package exercicios_java_experience;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    String[] animais = {"vertebrado", "invertebrado", "ave", "mamifero", "inseto", "anelideo"};

	    String palavra1 = scanner.nextLine();
	    String palavra2 = scanner.nextLine();
	    String palavra3 = scanner.nextLine();
	    scanner.close();

	    if(palavra1.equalsIgnoreCase("vertebrado")) {
	    	if(palavra2.equalsIgnoreCase("ave")) {
	    		if (palavra3.equalsIgnoreCase("onivoro")) {
	    			System.out.println("POMBO");
	    		}
	    	    else if(palavra3.equalsIgnoreCase("carnivoro")) {
	    			System.out.println("AGUIA");
	    		}
	    	}
	    }
	    else if (palavra2.equalsIgnoreCase("mamifero")) {
	    	if (palavra3.equalsIgnoreCase("herbivoro")) {
	    		System.out.println("VACA");
	    	}
	    	else if(palavra3.equalsIgnoreCase("onivoro")) {
	    		System.out.println("HOMEM");
	    	}
	    }
	    else if (palavra1.equalsIgnoreCase("invertebrado")) {
	    	if(palavra2.equalsIgnoreCase("inseto")) {
	    		if (palavra3.equalsIgnoreCase("herbivoro")) {
	    			System.out.println("LAGARTA");
	    		}
	    		else if (palavra3.equalsIgnoreCase("hematofago")) {
	    			System.out.println("PULGA");
	    		}
	    	}
	    }
	    else if(palavra2.equalsIgnoreCase("anelido")) {
	    	if(palavra3.equalsIgnoreCase("onivoro")) {
	    		System.out.println("MINHOCA");
	    	}
	    	else if(palavra3.equalsIgnoreCase("hematofago")) {
	    		System.out.println("SANGUESSUGA");
	    	}
	    }
	    
	  }
	}