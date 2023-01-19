import java.util.Scanner;

public class at03 {
    public static void main(String[] args){
        Scanner vendedor = new Scanner(System.in);
        double salario, vendas;

        System.out.println("Insira o nome do vendedor:");
        String nome = vendedor.nextLine();

        System.out.println("Insira o salário do vendedor:");
        salario = vendedor.nextDouble();

        System.out.println("Insira o total de vendas do vendedor:");
        vendas = vendedor.nextDouble();

        double total = ((15*vendas)/100 + salario);
        
        System.out.println(nome + "Recebe total de = R$" + total);

        vendedor.close();
    }


}
