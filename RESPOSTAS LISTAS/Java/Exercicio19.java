import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double salario = in.nextDouble();
        in.close();
        double novo_salario;

        if(salario > 500){
            novo_salario = salario + salario*0.1;
        }else if(salario > 300){
            novo_salario = salario + salario*0.07;
        }else{
            novo_salario = salario + salario*0.05;
        }
        System.out.println(novo_salario);
    }
}
