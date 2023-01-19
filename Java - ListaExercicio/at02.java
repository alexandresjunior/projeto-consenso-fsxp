import java.util.Scanner;

public class at02 {

        public static void main(String[] args){

            Scanner funcionario = new Scanner(System.in);
            double valorTrabalho;
            int numero, horas;
    
            System.out.println("Insira o número do funcionário:");
            numero = funcionario.nextInt();

            System.out.println("Insira as horas trabalhadas do funcionário:");
            horas = funcionario.nextInt();

            System.out.println("Insira as horas trabalhadas do funcionário:");
            valorTrabalho = funcionario.nextDouble();

            double salario = (horas*valorTrabalho);

            System.out.println("Número: " + numero);
            System.out.println("Salário: R$ " + salario);

            funcionario.close();

        }
}