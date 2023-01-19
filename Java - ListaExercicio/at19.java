import java.util.Scanner;

public class at19 {
    
    public static void main(String[] args) {

      Scanner entrada = new Scanner(System.in); 
      double salario;
    
      
      System.out.println("Insira o valor do salário:");
      salario = entrada.nextDouble();
      
      if(salario >= 500){
        salario = salario + (salario * 10)/100; 
      } 
      else if(salario >= 300 && salario < 500){
        salario = salario + (salario * 7) / 100;
      } else {
        salario = salario + (salario * 5) / 100;
      }

      System.out.println(salario);

      entrada.close();
    }
}
