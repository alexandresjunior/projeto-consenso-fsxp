import java.util.Scanner;
public class Questao03{
    //Faça um programa que lê o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.//
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome;
        double salario, vendas, total;

        System.out.println("Insira o nome do funcionário:");
        nome = entrada.next();

        System.out.println("Insira o valor do saláro fixo:");
        salario = entrada.nextDouble();

        System.out.println("Insira o valor das vendas efetuadas:");
        vendas = entrada.nextDouble();

        total = salario + vendas * 0.15;

        System.out.println("TOTAL = "+total);
    }
}