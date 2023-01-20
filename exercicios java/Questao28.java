public class Questao28 {
    /*Você deve fazer um programa que apresente a sequência conforme o exemplo
abaixo.
 */
    public static void main(String[] args)  {
		int i = 1;
        for (int j = 60; j >= 0; j = j - 5) {
            System.out.println("I=" + i + " J=" +j);
            i = i + 3;
        }
	}
}
