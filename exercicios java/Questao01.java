import java.util.Scanner;
public class Questao01{
    //Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. Calcule a média ponderada do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5. A soma dos pesos é 11. Assuma que cada nota pode ir de O até 10.0, sempre com uma casa.//
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A, B, media;

        System.out.println("Insira a 1° nota:");
        A = entrada.nextDouble();

        System.out.println("Insira a 2° nota:");
        B = entrada.nextDouble();

        media = ((A*3.5) + (B*7.5))/11;
        System.out.println("Média: "+media);
    }
}