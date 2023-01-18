import java.util.Scanner;
    public class Exercicio01{

    public static void main (String[]args) {
        double notaA;
        double notaB;
        double media;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        notaA = entrada.nextDouble();
         
 
        System.out.println("Digite a segunda nota: ");
        notaB = entrada.nextDouble();
         
         
        media = ((notaA*3.5) +(notaB*7.5)) /11;

        System.out.println("A média do aluno é de: " + media);
        entrada.close();
    }

}



