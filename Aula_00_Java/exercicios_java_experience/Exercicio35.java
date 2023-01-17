package exercicios_java_experience;

public class Exercicio35 {

	public static void main(String[] args) {
		double s = 1, i, j;
		
		for (i = 3,j = 2;  i <= 39; i+=2,j *= 2) {
			s += i / j;
		}
		
		System.out.printf("%.2f\n",s);

	}

	}


