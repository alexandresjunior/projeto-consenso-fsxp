import java.util.Scanner;
public class Questao42 {
    /*Vovó Rosa e seus colegas de turma foram ao cinema assistir a um filme, mas
ficaram estarrecidos com o aumento do preço do ingresso. Revoltados, eles
decidiram fazer uma manifestação contra o sistema capitalista opressor, agendada
para amanhã na Praça José de Alencar. */
    public static void main(String[] args) {	
		Scanner entrada = new Scanner(System.in);

		double a, b = 0;
		double aumento = 0;

		System.out.println("Valor antigo: ");
		a = entrada.nextDouble();

		System.out.println("Novo valor: ");
		b = entrada.nextDouble();

		aumento = ((b * 100) / a) - 100;

		System.out.println(aumento + "%");

	}
}
