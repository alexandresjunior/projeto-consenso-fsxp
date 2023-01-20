import java.util.Scanner;
public class Questao45 {
    /* Elabore um programa que leia o nome e a idade de cinco pessoas e apresente:
a maior idade, nome da pessoa mais nova, média das idades.
 */
public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);

	        String nomeMaiorI = "";
	        String nomeMenorI = "";
	        float maiorI = 0;
	        float menorI = Float.MAX_VALUE;
	        float somaI = 0;

	        for (int i = 0; i < 5; i++) {
	            String nome = entrada.next();
	            float idade = entrada.nextFloat();

	            somaI += idade;

	            if (idade > maiorI) {
	                maiorI = idade;
	                nomeMaiorI = nome;
	            }

	            if (idade < menorI) {
	                menorI = idade;
	                nomeMenorI = nome;
	            }
	        }

	        float mediaIdades = somaI / 5;

	        System.out.println("Maior Idade: " + maiorI);
	        System.out.println("Nome da pessoa mais nova: " + nomeMenorI);
	        System.out.println("Média das idades: " + mediaIdades);

	       
	    }
}
