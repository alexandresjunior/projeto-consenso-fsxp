import java.util.Scanner;
public class Exercicio11 {
  public static void main(String[] args) {
    int horainicial;
    int horafinal;
    int duracao;

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite a hora que começou a partida: ");
    horainicial= entrada.nextInt();

    System.out.println("Digite a hora que terminou a partida: ");
    horafinal= entrada.nextInt();

    duracao = (horafinal - horainicial);

    if (duracao <= 0) {
      duracao = (horafinal - horainicial)+24;
    System.out.println("O JOGO DUROU:" + duracao + " HORAS");
    }
    else{
      System.out.println("O JOGO DUROU:" + duracao + " HORAS");
      entrada.close();
  }
  }
}