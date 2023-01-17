package treinaRecife;
import java.util.Scanner;
public class Exercicio03 {
	public static void main(String[] args) {
	   
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Digite o nome do vendedor: ");
	    String nome = scanner.nextLine();
	    System.out.print("Digite o salário fixo do vendedor: ");
	    double salarioFixo = scanner.nextDouble();
	    System.out.print("Digite o total de vendas efetuadas pelo vendedor: ");
	    double totalVendas = scanner.nextDouble();

	   
	    double comissao = totalVendas * 0.15;
	    double totalAReceber = salarioFixo + comissao;

	    scanner.close();
	    System.out.printf("TOTAL = R$ %.2f\n", totalAReceber);
	  }
}
