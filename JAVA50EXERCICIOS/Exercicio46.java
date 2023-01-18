import java.util.Scanner;
public class Exercicio46 {

    public static void main (String args[]){
    
    int num1,num2, soma;
    
   
    Scanner entrada = new Scanner(System.in);
    System.out.println("Insira o seu número: ");
    num1 = entrada.nextInt();
    System.out.println("Insira o seu número: ");
    num2 = entrada.nextInt();



    int f = num1;
    int g = num2;

    while ((num1 > 1) && (num2 > 1)){ 
    
      f = f *(num1-1); 
      num1--;
      g = g * (num2 - 1);
      num2--;
    }

      soma = f + g;
      System.out.println(soma);
      entrada.close();
}
}