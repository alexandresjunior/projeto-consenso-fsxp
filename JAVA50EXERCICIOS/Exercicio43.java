import java.util.Scanner;
public class Exercicio43 {
 
    public static void main(String[] args) {
        int num1;
        int num2;
        int troco;

	Scanner entrada = new Scanner(System.in);
	
	
	
	System.out.println("Preço Antigo: ");
	num1 = entrada.nextInt();

    System.out.println("Preço novo: ");
	num2 = entrada.nextInt();


    troco = num2 - num1;

    if ((troco == 7) || (troco == 12) || (troco == 22) || (troco == 52) || (troco == 102)){
        System.out.println("POSSÍVEL");
    }
    else if ((troco == 15) || (troco == 25) || (troco == 55) || (troco == 105)){
        System.out.println("POSSÍVEL");
    }
    else if ((troco == 30) || (troco == 60) || (troco == 110)){
        System.out.println("POSSÍVEL");
    }
    else if ((troco == 70) || (troco == 120)){
        System.out.println("POSSÍVEL");
    }
    else if ((troco == 150)){
        System.out.println("POSSÍVEL");
    }
    else{
        System.out.println("IMPOSSÍVEL");
    }
    entrada.close();
    }
    }
