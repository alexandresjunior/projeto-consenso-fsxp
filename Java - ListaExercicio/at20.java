import java.util.Scanner;

public class at20 {
    
    public static void voida(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String bairro;
        double renda = 0;
        double consumo = 0;
        double desconto = 0;
        double valor = 0;
        
        System.out.println("Insira a primeira letra do seu bairro (S/I/T):");
        bairro = entrada.next();

        System.out.println("Insira sua renda:");
        renda = entrada.nextDouble();

        System.out.println("Insira seu consumo:");
        consumo = entrada.nextDouble();

        if(bairro == "S"){
            bairro = "Santa Ana";
        } else if (bairro == "I"){
            bairro = "Industriários";
        }else if (bairro == "T"){
            bairro = "Tabatinga";
        }else{
            bairro = "Bairro Inválido";
        }

        if (bairro == "s") {
            if (renda >= 50 && renda <= 500) {
                desconto = 50;

            } else if (renda >= 500 && renda <= 1000) {
                desconto = 25;
            }
        } else if (bairro == "i") {
            if (renda >= 240 && renda <= 1000) {
                desconto = 240;
            } else if (renda >= 1000 && renda <= 5000) {
                desconto = 120;
            }
        } else {
            if (renda >= 5000 && renda <= 10000) {
                desconto = 720;
            } else if (renda >= 1000 && renda <= 20000) {
                desconto = 360;
            }
        }

        valor = (consumo - desconto);

        if (renda < 0 || consumo < 0) {
            System.out.println("RENDA OU CONSUMO NÃO PODEM SER NEGATIVOS");
        } else if (bairro == "BAIRRO INVÁLIDO") {
            System.out.println(bairro);
        } else {
            System.out.println("VALOR DA CONTA R$" + valor);
        }
        
        entrada.close();
    }
}
