import java.util.Scanner;
public class Questao16 {
    
    /*Supondo que a população de um país A seja recebido via teclado em uma
variável com dupla precisão (double) representando a população atual daquele país
que possui uma taxa anual de crescimento de 3% a.a. o que a população de um
país B seja recebida também em uma variável com dupla precisão e que tenha uma
taxa anual de crescimento de 1,5% a.a., fazer um programa que calcule e de anos
necessários para que a população do país A ultrapasse ou iguale a população do
número do país B, mantida essas taxas de crescimento.
 */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
    System.out.println("Insira a população do 1° país:");
    double A = entrada.nextDouble();

    System.out.println("Insira a população do 2° país:");
    double B = entrada.nextDouble();

     double taxaA = 0.03;
     double taxaB = 0.015;
    int anos = 0;

    while (A < B){
        A = A + (A * taxaA);
        B = B + (B * taxaB);
        anos = anos + 1;
        
    }
    System.out.println("Serão necessários "+anos+" anos para que a população do 1° país ultrapasse a do 2°.");
    }
}
