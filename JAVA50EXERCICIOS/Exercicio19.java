import java.util.Scanner;
public class Exercicio19 {
    public static void main(String args[]) {
    double salario;
    double salarioajustado;

    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite o valor do seu salário atual: ");
    salario= entrada.nextDouble();


    if (salario > 500){
        salarioajustado = salario + (salario * 0.10);
        System.out.println(salarioajustado);
        
    }
    else if ((500 >= salario) && (salario > 300)){
        salarioajustado = salario + (salario * 0.07);
        System.out.println(salarioajustado);
    }
    else{
        salarioajustado = salario + (salario * 0.05);
        System.out.println(salarioajustado);
    }
    entrada.close();
}
}