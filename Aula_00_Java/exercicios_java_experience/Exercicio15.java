package exercicios_java_experience;

public class Exercicio15 {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int temp;
		for (int i = 0 ; i <46 ; i++) {
			System.out.println(a);
			temp=a;
			a = a+b;
			b = temp;
			
		}

	}

}
