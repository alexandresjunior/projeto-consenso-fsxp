import java.util.Scanner;
public class Exercicio20 {
    public static void main(String args[]) {
        String bairro;
    
        int renda;
        int consumo;
        int desconto;
        double valortotal;


        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o caractere do bairro do cliente: ");
        bairro= entrada.nextLine();


        if (bairro.equalsIgnoreCase("S")){
            System.out.println("Bairro de Santa Ana");
            System.out.print("Digite o valor da renda do cliente: ");
            renda = entrada.nextInt();

            System.out.print("Digite o valor do consumo do cliente: ");
            consumo = entrada.nextInt();

            if ((renda < 0) || (consumo < 0)){
                System.out.println("RENDA E CONSUMO NÃO PODEM SER NEGATIVOS");
            }

            else if ((renda < 50) || (renda > 20000)){
                desconto = 0;
                valortotal = consumo - desconto;
                System.out.println(valortotal);
            }
            else if ((renda >= 50) || (renda <= 500)){
                desconto = 25;
                valortotal = consumo - desconto;
                System.out.println(valortotal);
            }
            else if ((renda >= 500) && (renda <= 1000)){
                desconto = 50;
                valortotal = consumo - desconto;
                System.out.println(valortotal);
            }
        }

        else if (bairro.equalsIgnoreCase("I")){
            System.out.println("Bairro de Industriários");
            System.out.print("Digite o valor da renda do cliente: ");
            renda = entrada.nextInt();

            System.out.print("Digite o valor do consumo do cliente: ");
            consumo = entrada.nextInt();

            if ((renda < 0) || (consumo < 0)){
                System.out.println("RENDA E CONSUMO NÃO PODEM SER NEGATIVOS");
            }

            else if ((renda < 50) || (renda > 20000)){
                desconto = 0;
                valortotal = consumo - desconto;
                System.out.println(valortotal);
            }
            else if ((renda >= 240) && (renda <= 1000)){
                desconto = 240;
                valortotal = consumo - desconto;
                System.out.println(valortotal);
            }
            else if ((renda >= 1000) && (renda <= 5000)){
                desconto = 120;
                valortotal = consumo - desconto;
                System.out.println(valortotal);
            }
        }
        
        else if (bairro.equalsIgnoreCase("T")){
            System.out.println("Bairro de Tabatinga");
            System.out.print("Digite o valor da renda do cliente: ");
            renda = entrada.nextInt();

            System.out.print("Digite o valor do consumo do cliente: ");
            consumo = entrada.nextInt();

            if ((renda < 0) || (consumo < 0)){
                System.out.println("RENDA E CONSUMO NÃO PODEM SER NEGATIVOS");
            }

            else if ((renda < 50) || (renda > 20000)){
                desconto = 0;
                valortotal = consumo - desconto;
                System.out.println(valortotal);
            }
            else if ((renda >= 5000) && (renda <= 10000)){
                desconto = 720;
                valortotal = consumo - desconto;
                System.out.println(valortotal);
            }
            else if ((renda >= 10000) && (renda <= 20000)){
                desconto = 360;
                valortotal = consumo - desconto;
                System.out.println(valortotal);
            }
        }
        else {
            System.out.println("BAIRRO INVÁLIDO");
        }
        entrada.close();
    }
    
}
