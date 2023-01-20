public class Questao35 {
    /* Escreva um programa para calcular e escrever o valor de S, sendo S dado pela
fórmula: S = 1 + 3/2 + 5/4 + 7/8 +... + 39/?
*/
    public static void main(String[] args) {
		float S = 1, i, j;
		
		for (i = 3,j = 2;  i <= 39; i+=2,j *= 2) {
			S += i / j;
		}
		
		System.out.printf("%.2f\n",S);

	}
}
