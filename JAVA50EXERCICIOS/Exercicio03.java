import java.util.Scanner;
public class Exercicio03 {
  public static void main(String[] args) {
    String nome;
    double salariofixo;
    double totaldevendas;
    double total;

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o seu nome: ");
    nome = entrada.nextLine();

    System.out.println("Digite o seu salario fixo: ");
    salariofixo = entrada.nextDouble();

    System.out.println("Digite o valor do total de vendas: ");
    totaldevendas = entrada.nextDouble();

    total = salariofixo + (0.15*totaldevendas);
    System.out.println("TOTAL = R$" + total);

    entrada.close();
    
  }

}
