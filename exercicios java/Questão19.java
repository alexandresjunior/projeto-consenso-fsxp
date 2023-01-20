import java.util.Scanner;
public class Questão19 {
    /*Devido à proximidade com o Dia do Trabalho, uma empresa resolveu conceder
aumentos salariais a seus funcionários. Aqueles com salário superior a R$ 500,
terão aumento de 10%, enquanto os que ganham mais de R$ 300 terão aumento de
7%. Os demais funcionários terão aumento de apenas 5%. Escreva um programa
que receba como entrada o salário atual de um funcionário, calcule e exiba o valor
de seu novo salário já com o aumento concedido.
 */
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Informe o valor do salário:");
    double salario = entrada.nextDouble();

    if(salario >= 500){
        salario += (salario * 10) /100;
        System.out.println("O novo salário será de: "+salario);
    }else if(salario >=300 && salario < 500){
        salario += (salario * 7) /100;
        System.out.println("O novo salário será de: "+salario);
    }else{
        salario += (salario * 5) /100;
        System.out.println("O novo salário será de: "+salario);
    }

}
}
