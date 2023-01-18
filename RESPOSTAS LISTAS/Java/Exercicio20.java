import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String bairro = in.nextLine();
        double renda = in.nextDouble();
        double consumo = in.nextDouble();
        in.close();
        
        if(bairro.equals("S")){
            if(renda >= 50 && renda < 500){
                consumo -= 50;
                System.out.println(consumo);
            }else if(renda >= 500 && renda < 1000){
                consumo -= 25;
                System.out.println(consumo);
            }else if(renda < 0 || consumo < 0){
                System.out.println("RENDA E CONSUMO NÃO PODEM SER NEGATIVOS");
            }
        }else if(bairro.equals("I")){
            if(renda >= 240 && renda < 1000){
                consumo -= 240;
                System.out.println(consumo);
            }else if(renda >= 1000 && renda < 5000){
                consumo -= 120;
                System.out.println(consumo);
            }else if(renda < 0 || consumo < 0){
                System.out.println("RENDA E CONSUMO NÃO PODEM SER NEGATIVOS");
            }
        }else if(bairro.equals("T")){
            if(renda >= 5000 && renda < 10000){
                consumo -= 720;
                System.out.println(consumo);
            }else if(renda >= 10000 && renda < 20000){
                consumo -= 360;
                System.out.println(consumo);
            }else if(renda < 0 || consumo < 0){
                System.out.println("RENDA E CONSUMO NÃO PODEM SER NEGATIVOS");
            }
        }else{
            System.out.println("BAIRRO INVÁLIDO");
        }
    }
}