package exercicios_java_experience;

public class Exercicio24 {

	public static void main(String[] args) {
		int num = 103301;
		String numStr = Integer.toString(num);
		String reversedNumStr = new StringBuilder(numStr).reverse().toString();

		if (numStr.equals(reversedNumStr)) {
		    System.out.println(num + " é palíndromo");
		} else {
		    System.out.println(num + " não é palíndromo");
		}
	}

}
