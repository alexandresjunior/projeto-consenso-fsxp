public class Questao29 {
    /*Você deve fazer um programa que apresente a sequência conforme o exemplo
abaixo.
 */
    public static void main(String[] args)  {
		int i=1, j=7;
		while (i <= 9) {
			for (int k = 0; k < 3; k++) {
				System.out.println("I=" + i + " J=" + j);
				j--;
			}
			j+=5;
			i+=2;
		}
	}
}
