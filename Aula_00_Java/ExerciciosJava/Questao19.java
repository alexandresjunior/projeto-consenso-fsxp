
import java.util.Scanner;

public class Questao19 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o salario do funcionario: ");
        double salario = entrada.nextDouble();

        entrada.close();

        if(salario > 500){
            salario = salario + (salario * 0.1);
            System.out.println("aumento de salario:" + salario);
        }else if (salario > 300){
            salario = salario + (salario * 0.07);
            System.out.println("aumento de salario: " + salario);

        }else{
            salario = salario + (salario * 0.05);
            System.out.println("aumento de salario: " + salario);
        }



}

}
