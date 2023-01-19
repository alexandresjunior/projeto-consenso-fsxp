import java.util.Scanner;

public class at10 {
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int idade;

        System.out.println("Insira a sua idade em dias:");
        idade = entrada.nextInt();

        int ano = idade/365;
        idade = idade % 365;
        int mes = idade/30;
        idade = idade % 30;
        int dia = idade;

        System.out.println(ano + "ano (s)");
        System.out.println(mes + "mes (es)");
        System.out.println(dia + "dia (s)");
        
        entrada.close();
    }


}
