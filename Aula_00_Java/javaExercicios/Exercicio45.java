package javaExercicios;
import java.util.Scanner;

public class Exercicio45 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);

	        String nomeMaiorIdade = "";
	        String nomeMenorIdade = "";
	        float maiorIdade = 0;
	        float menorIdade = Float.MAX_VALUE;
	        float somaIdades = 0;

	        for (int i = 0; i < 5; i++) {
	            String nome = scan.next();
	            float idade = scan.nextFloat();

	            somaIdades += idade;

	            if (idade > maiorIdade) {
	                maiorIdade = idade;
	                nomeMaiorIdade = nome;
	            }

	            if (idade < menorIdade) {
	                menorIdade = idade;
	                nomeMenorIdade = nome;
	            }
	        }

	        float mediaIdades = somaIdades / 5;

	        System.out.println("Maior Idade: " + maiorIdade);
	        System.out.println("Nome da pessoa mais nova: " + nomeMenorIdade);
	        System.out.println("Média das idades: " + mediaIdades);

	        scan.close();
	    }
	}

