import java.util.Scanner;
public class Questao04 {
    // Faça um programa que leia do teclado três valores inteiros e exiba o maior e menor entre eles.//
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o 1° valor: ");
        int A = entrada.nextInt();

        System.out.println("Insira o 2° valor: ");
        int B = entrada.nextInt();

        System.out.println("Insira o 3° valor: ");
        int C = entrada.nextInt();
        
        int MaiorNum; 
        if(A>B && A>C){
            MaiorNum = A;
            System.out.println(" O maior número é o: " + A);
        }
        else if (B>A && B>C){
            MaiorNum = B;
            System.out.println(" O maior número é o: " + B);
        }else{
            MaiorNum = C;
            System.out.println(" O maior número é o: " + C);
        }

        int MenorNum;
        if(A<B && A<C){
            MenorNum = A;
            System.out.println(" O menor número é o: " + A);
        }
        else if (B<A && B<C){
            MenorNum = B;
            System.out.println(" O menor número é o: " + B);
        }else{
            MenorNum = C;
            System.out.println(" O menor número é o: " + C);
        }



       
    }
}
