package exercicios_java_experience;

public class Exercicio18 {

	public static void main(String[] args) {
		int n = 1000;
		
		
		
		int primeiroNumero = n/1000;
		System.out.println(primeiroNumero);
		int segundoNumero = (n%1000)/100;
		System.out.println(segundoNumero);
		int terceiroNumero = (n%100)/10;
		System.out.println(terceiroNumero);
		int quartoNumero = n%10;
		
		System.out.print(quartoNumero);
		System.out.print(terceiroNumero);
		System.out.print(segundoNumero);
		System.out.print(primeiroNumero);

	}

}
