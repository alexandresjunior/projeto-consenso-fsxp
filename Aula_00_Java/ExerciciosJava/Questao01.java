
/*1. Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2
notas de um aluno. Calcule a média ponderada do aluno, sabendo que a nota A tem
peso 3.5 e a nota B tem peso 7.5. A soma dos pesos é 11. Assuma que cada nota
pode ir de O até 10.0, sempre com uma casa.
Entrada
O arquivo de entrada contém 2 valores com uma casa decimal cada um.
Saída
Calcule e imprima a variável MÉDIA conforme exemplo abaixo, com um espaço em
branco antes e depois da igualdade. Utilize variáveis de dupla precisão (double).*/

import java.util.Scanner;

public class Questao01{


    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);
        double nota1,nota2,media;

        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextDouble() * 3.5;

        System.out.println("Digite a Segunda nota: ");
        nota2 = entrada.nextDouble() * 7.5;

        media = (nota1 + nota2)/11;

        if(media >= 0 && media <=10){
            System.out.println("MÉDIA = " + media);
        }else{
            System.out.println("nota invalida");
        }

        entrada.close();

    }
    
}