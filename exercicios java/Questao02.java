import java.util.Scanner;
public class Questao02 {
    //Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcule o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.//
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int funcionario;
        int horas;
        double valorHora;
        double salario;

        System.out.println("Insira o número do funcionario:");
        funcionario = entrada.nextInt();

        System.out.println("insira o número de horas trabalhadas:");
        horas = entrada.nextInt();

        System.out.println("Insira o valor por hora trabalhada:");
        valorHora = entrada.nextDouble();

        salario = (valorHora * horas);

        System.out.println("Número: "+ funcionario);
        System.out.printf("Sálario = R$ %.2f", salario);
    }
}
