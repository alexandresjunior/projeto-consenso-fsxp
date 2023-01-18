import java.util.Scanner;
public class Exercicio31 {
    public static void main(String[] args) {
        float num1;
        float num2;
        double media;

        Scanner entrada =new Scanner(System.in);
        System.out.print("Digite um numero: ");
        num1 = entrada.nextFloat();
        while (num1 < 0){
            System.out.println("NOTA INVÁLIDA");
            System.out.print("Digite um numero: ");
            num1 = entrada.nextFloat();
        }
        while (num1 > 10.0){
            System.out.println("NOTA INVÁLIDA");
            System.out.print("Digite um numero: ");
            num1 = entrada.nextFloat();
        }
        System.out.print("Digite um numero: ");
        num2 = entrada.nextFloat();
        while (num2 < 0){
            System.out.println("NOTA INVÁLIDA");
            System.out.print("Digite um numero: ");
            num2 = entrada.nextFloat();
        }
        while (num2 > 10.0){
            System.out.println("NOTA INVÁLIDA");
            System.out.print("Digite um numero: ");
            num2 = entrada.nextFloat();
        }

        media = (num1 + num2)/2;
        System.out.println("A MÉDIA É: " + media);
        entrada.close();

}
}