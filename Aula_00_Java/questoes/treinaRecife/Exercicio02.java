package treinaRecife;
import java.util.Scanner;
public class Exercicio02 {
	 public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
		    System.out.print("Digite o número do funcionário: ");
		    int numeroFuncionario = scanner.nextInt();
		    System.out.print("Digite o número de horas trabalhadas: ");
		    int horasTrabalhadas = scanner.nextInt();
		    System.out.print("Digite o valor por hora: ");
		    double valorHora = scanner.nextDouble();


		    double salario = horasTrabalhadas * valorHora;
		    scanner.close();

		    System.out.printf("NUMBERO = %d\n", numeroFuncionario);
		    System.out.printf("SALARIO = R$ %.2f\n", salario);
		  }
}
