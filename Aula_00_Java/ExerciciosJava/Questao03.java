
/*Faça um programa que lê o nome de um vendedor, o seu salário fixo e o total de
vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha
15% de comissão sobre suas vendas efetuadas, informar o total a receber no final
do mês, com duas casas decimais.
Entrada
O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de
dupla precisão (double) com duas casas decimais, representando o salário fixo do
vendedor e montante total das vendas efetuadas por este vendedor,
respectivamente.
Saída
Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.
 */

import java.util.Scanner;
public class Questao03 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String nome;
        double salario,vendas,salarioFinal;

        System.out.println("Digite o nome do vendedor: ");
        nome = entrada.nextLine();
        
        System.out.println("Digite o salario do vendedor: ");
        salario = entrada.nextDouble();

        System.out.println("digite o valor das vendas do vendedor: ");
        vendas = entrada.nextDouble();

        salarioFinal = salario + (vendas * 0.15);

        System.out.printf("\nTOTAL = R$ %.2f",salarioFinal);
        entrada.close();
    
    }

}
