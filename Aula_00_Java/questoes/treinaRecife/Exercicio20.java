package treinaRecife;

import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String bairro = sc.nextLine();
        double conta = sc.nextDouble();
        double renda = sc.nextDouble();
        sc.close();
        double x = 0;
        if (conta > 0 && renda > 0) {
            switch(bairro){
                case "I": 
                    if (renda >= 50 && renda <= 500) {
                        x = conta - 50; 
                    } else if (renda > 500 && renda < 1000) {
                        x = conta - 25; 
                    } else if (renda >= 1000) {
                        x = conta;
                    }
                    break; 
                case "T": 
                    if (renda > 240 && renda <= 1000) {
                        x = conta - 120; 
                    } else if (renda > 1000 && renda < 5000) {
                        x = conta - 720; 
                    } else if (renda >= 5000) {
                        x = conta;
                    }
                    break;
                case "S": 
                    if (renda >= 5000 && renda <= 10000) {
                        x = conta - 720; 
                    } else if (renda > 10000 && renda < 20000) {
                        x = conta - 360; 
                    } else if (renda >= 20000) {
                        x = conta;
                    }
                    break;
                default: 
                    System.out.println("BAIRRO INVALIDO"); 
            }
        } else if (renda < 0 || conta < 0) {
            System.out.println("RENDA E CONSUMO NÃO PODE SER NEGATIVOS");
        } else {
            System.out.println("RENDA E CONSUMO DEVEM SER MAIORES QUE 0");
        }
        System.out.printf("%.2f %n", x);
    }
}
