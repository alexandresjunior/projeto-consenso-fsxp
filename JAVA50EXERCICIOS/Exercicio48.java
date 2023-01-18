import java.util.Scanner;
public class Exercicio48 {
    public static void main (String args[]){
        int idade;
        float peso;
        int mlg;
        int ml;
        int gotas;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira a sua idade: ");
        idade = entrada.nextInt();
        System.out.println("Insira o seu peso: ");
        peso = entrada.nextFloat();
        
        if (idade >= 12){
            if (peso >= 60){
                mlg = 1000;
                ml = mlg/500;
                gotas = ml * 20;
                System.out.println(gotas + " gotas");
            }
        
            else if (peso < 60 ){
                mlg = 875;
                ml = mlg/500;
                gotas = ml * 20;
                System.out.println(gotas + " gotas");
            }
        }
        else{
            if ((peso >= 5) && (peso <= 9)){
                mlg = 125;
                 ml = mlg/500;
                 gotas = ml * 20;
                 System.out.println(gotas + " gotas");
            }
        
            else if ((peso >= 9.1) && (peso <= 16)){
                mlg = 250;
                ml = mlg/500;
                gotas = ml * 20;
                System.out.println(gotas + " gotas");
            }
        
            else if ((peso >= 16.1) && (peso <= 24)){
                mlg = 375;
                ml = mlg/500;
                gotas = ml * 20;
                System.out.println(gotas + " gotas");
            }
        
            else if ((peso >= 24.1) && (peso <= 30)){
                mlg = 500;
                ml = mlg/500;
                gotas = ml * 20;
                System.out.println(gotas + " gotas");
            }
        
            else if (peso > 30){
                mlg = 750;
                ml = mlg/500;
                gotas = ml * 20;
                System.out.println(gotas + " gotas");
            }
        }
        entrada.close();
    }
}


    


