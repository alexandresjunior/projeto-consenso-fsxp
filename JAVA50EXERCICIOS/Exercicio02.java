import java.util.Scanner;
    public class Exercicio02 {
    
        public static void main (String[]args) {
            int numero;
            int horastrabalhadas;
            double valorhora;  
            double salario;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite seu numero: ");
        numero = entrada.nextInt();
         
     
 
        System.out.println("Digite a quantidade de horas q vc trabalhou:  ");
        horastrabalhadas = entrada.nextInt();
         
        System.out.println("Digite o valor q vc recebe por hora trabalhada:  ");
        valorhora = entrada.nextDouble();

        salario = (horastrabalhadas * valorhora);

        System.out.println("NUMERO = " + numero + "\nSALARIO = " + salario);   

        entrada.close();

        }

}
