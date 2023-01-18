import java.util.Scanner;
public class Exercicio07 {
  
    public static void main (String[]args) {
    int n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, n1 =0;
    int dinheiro;

    Scanner entrada = new Scanner(System.in) ;
	System.out.println("Digite um valor: " );
    dinheiro = entrada.nextInt();

    while (dinheiro != 0) {
        if (dinheiro >= 100) {
            n100 = dinheiro/100;
            dinheiro = dinheiro % 100;
        }
        else if (dinheiro >= 50) {
            n50 = dinheiro / 50;
            dinheiro = dinheiro % 50;
        } 
        else if (dinheiro >= 20) {
            n20 = dinheiro / 20;
            dinheiro = dinheiro % 20;
        } 
        else if (dinheiro >= 10) {
            n10 = dinheiro / 10;
            dinheiro = dinheiro % 10;
        } 
        else if (dinheiro >= 5) {
            n5 = dinheiro / 5;
            dinheiro = dinheiro % 5;
        } 
        else if (dinheiro >= 2) {
            n2 = dinheiro / 2;
            dinheiro = dinheiro % 2;
        }
        else if (dinheiro >= 1) {
            n1 = dinheiro / 1;
            dinheiro = dinheiro % 1;
        }
    }
    System.out.println(n100+ " notas de R$100");
    System.out.println(n50 + " notas de R$50");
    System.out.println(n20 + " notas de R$20");
    System.out.println(n10 + " notas de R$10");
    System.out.println(n5 + " notas de R$5");
    System.out.println(n2 + " notas de R$2");
    System.out.println(n1 + " notas de R$1");
    
    entrada.close();
}
}